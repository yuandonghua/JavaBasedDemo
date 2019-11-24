package fit.hrkj.jdbc;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 控制台表格样式格式化器:不考虑中文的展示形式<br>
 * 2019年11月18日下午4:18:02
 * 
 * @author 华软科技
 * @version 1.0
 */
public class TableFormatter {
	/**
	 * 表格顶部边框线
	 */
	private static String tableTopline = "+";
	/**
	 * 默认列宽
	 */
	private static int defaultColumnWidth = 22;
	/**
	 * 当前结果集
	 */
	private static ResultSet currentResultSet;

	/**
	 * 展示表头：列名
	 * 
	 * @param rs 结果集
	 * @throws SQLException 遇到SQL异常
	 */
	public static void showHeader(ResultSet rs) throws SQLException {
		showHeader(defaultColumnWidth, rs);
	}

	/**
	 * 展示表头：列名
	 * 
	 * @param columnWidth 指定列宽
	 * @param rs          结果集
	 * @throws SQLException 遇到SQL异常
	 */
	public static void showHeader(int columnWidth, ResultSet rs) throws SQLException {
		defaultColumnWidth = columnWidth;
		currentResultSet = rs;
		// ResultSetMetaData是用于分析结果集的元数据接口
		ResultSetMetaData metaData = rs.getMetaData();
		// 列的个数
		int columnCount = metaData.getColumnCount();
		// 缓存列宽
		int tmp = columnWidth;
		// 列名这行字符串
		String columnString = "|";
		for (int i = 1; i <= columnCount; i++) {

			// 获取列名
			String columnName = metaData.getColumnName(i);
			// 列名的长度
			int columnNameLength = columnName.length();
			// 指定列宽不能小于列名的长度
			if (columnWidth < columnNameLength) {
				columnWidth = columnNameLength;
			}
			// 拼接表格顶部边框
			for (int j = 0; j < columnWidth; j++) {
				tableTopline += "-";
			}
			tableTopline += "+";

			// 列宽与列名长度的总差距
			int allGap = columnWidth - columnNameLength;
			// 列名左边距离边框的距离
			int leftGap = allGap / 2;
			// 列名左边的空格
			String columnLeftBlank = "";
			// 列名右边的空格
			String columnrightBlank = "";
			for (int j = 0; j < leftGap; j++) {
				columnLeftBlank += " ";
			}
			// 默认列名右边的空格与左边相同
			// 计算不同时列名右边的空格
			columnrightBlank = columnLeftBlank;
			if (allGap % 2 != 0) {
				columnrightBlank = columnLeftBlank + " ";
			}
			// 拼接每列列名字符串
			columnString += columnLeftBlank + columnName + columnrightBlank + "|";
			// 重置列名左右的空格
			columnLeftBlank = "";
			columnrightBlank = "";
			// 如果列宽有变化，也重置
			if (columnWidth == columnNameLength) {
				columnWidth = tmp;
			}
		}
		// 打印表格顶部边框
		System.out.println(tableTopline);
		// 打印列名这一行
		System.out.println(columnString);
		// 打印表格顶部边框
		System.out.println(tableTopline);
	}

	/**
	 * 展示表格一行记录
	 * 
	 * @throws SQLException 遇到的SQL异常
	 */
	public static void showBody() throws SQLException {
		// ResultSetMetaData是用于分析结果集的元数据接口
		ResultSetMetaData metaData = currentResultSet.getMetaData();
		// 列的个数
		int columnCount = metaData.getColumnCount();
		// 列名这行字符串
		String columnString = "|";
		for (int i = 1; i <= columnCount; i++) {
			// 每列的值保证不能为空,把Object类型转为String预防大对象内容过多展示不下
			String columnValue = currentResultSet.getObject(i) + "";
			// 列值的长度
			int columnValueLength = columnValue.length();

			// 列宽与列名长度的总差距
			int allGap = defaultColumnWidth - columnValueLength;
			// 如果列值太长截断展示
			if (allGap < 0) {
				// 拼接每列列值字符串
				columnString += columnValue.substring(0, defaultColumnWidth) + "|";
				continue;
			}
			// 列名左边距离边框的距离
			int leftGap = allGap / 2;
			// 列名左边的空格
			String columnLeftBlank = "";
			// 列名右边的空格
			String columnrightBlank = "";
			for (int j = 0; j < leftGap; j++) {
				columnLeftBlank += " ";
			}
			// 默认列名右边的空格与左边相同
			// 计算不同时列名右边的空格
			columnrightBlank = columnLeftBlank;
			if (allGap % 2 != 0) {
				columnrightBlank = columnLeftBlank + " ";
			}
			// 拼接每列列值字符串
			columnString += columnLeftBlank + columnValue + columnrightBlank + "|";
		}
		// 打印列值这一行
		System.out.println(columnString);
	}

	/**
	 * 展示表格所有行记录
	 * 
	 * @throws SQLException 遇到的SQL异常
	 */
	public static void showBodyAll() throws SQLException {
		// 迭代输出ResultSet对象
		while (currentResultSet.next()) {
			// 依次输出每行记录
			TableFormatter.showBody();

		}
	}

	/**
	 * 展示表格底部边框
	 */
	public static void showFooter() {
		// 打印表格顶部边框
		System.out.println(tableTopline);
	}

}
