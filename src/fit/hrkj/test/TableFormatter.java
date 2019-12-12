package fit.hrkj.test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

/**
 * 格式化数据库查询结果集的格式化器<br>
 * 可以通过结果集对象创建此格式化器<br>
 * 2019年12月5日下午9:17:10<br>
 * 
 * @author 贾洪真
 * @version 1.1
 */
public class TableFormatter {
	/**
	 * 定义每列的宽度
	 */
	private int width;
	/**
	 * 定义列数
	 */
	private int columns;
	/**
	 * 要格式化的结果集对象
	 */
	private ResultSet resultSet;
	/**
	 * 	操作结果集的接口
	 */
	private  ResultSetMetaData reMetaData;
//	/**
//	 * 	无参构造器
//	 */
//	public TableFormatter() {
//	}
	/**
	 * 	创建格式化对象 每列的宽度默认是10
	 * @param resultset 要格式化的结果集对象
	 */
	public TableFormatter(ResultSet resultSet) {
		this.resultSet = resultSet;
		this.width = 10;
		setcolumns();
	}
	/**
	 * 	设置每列的宽度
	 * @param width 要设置的宽度
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	/**
	 * 	设置列的数量的方法
	 */
	private void setcolumns() {
		// 先通过结果集获取操作结果集的对象
		try {
			reMetaData= resultSet.getMetaData();
			columns = reMetaData.getColumnCount();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 	打印第一行或最后一行符号的方法
	 */
	private void printMark() {          
		for (int i = 0; i < columns; i++) {
			// 先打印一个加号
			System.out.print("+");
			// 然后循环打印"-"
			for (int j = 0; j < width; j++) {
				System.out.print("-");
			}
		}
		System.out.println("+");
	}
	/**
	 * 	打印列名或者查询的值的方法
	 * 	@param	要打印的内容
	 */
	private void printcontent(String content) {
			//先打印一个"|"
			System.out.print("|");
			//如果打印内容不为null
			if (content!=null) {
//				int length=content.length();
				int length=countLength(content);
				//如果列名的长度大于列宽,则截取列宽长度的列名打印
				if (length>width) {
					content=content.substring(0, width);
					System.out.print(content);
				}else {
					//如果列名的长度小于或等于列宽
					//先求列名和列宽之间的差的一半
					//如果过列宽和列名之间的长度为奇数,则左边的空格比右边少一个
					int sub=(width-length)/2;
					//求余
					int yu=(width-length)%2;
					//打印左边空格
					for (int j = 0; j <sub; j++) {
						System.out.print(" ");
					}
					//打印内容
					System.out.print(content);
					//打印右边空格
					for (int k =0; k <sub+yu; k++) {
						System.out.print(" ");
					}
				
				}
			}
	}
	/**
	 * 	
	 * @param content
	 * @return
	 */
	private int countLength(String content) {
		char[] values=content.toCharArray();
		int length=0;
		for (int i = 0; i < values.length; i++) {
			String tem=String.valueOf(values[i]);
			if (tem.matches("[\u4E00-\\u9FA0]")) {
				length+=2;
			}else {
				length++;
			}
		}
		return length;
	}
	/**
	 * 	打印列名的方法
	 * @throws SQLException 
	 */
	private void printColumnName() throws SQLException{
		for (int i = 1; i <= columns; i++) {
			//如果操作结果集的对象不为null
			if (reMetaData!=null) {
				//获取每列的列名
				String columnName = reMetaData.getColumnName(i);
				printcontent(columnName);
			}else {
				System.out.println("操作结果集的对象为null");
			}
		}
		System.out.println("|");
		
	}
	/**
	 * 	打印所有内容的方法
	 * @throws SQLException
	 */
	private void printcontent() throws SQLException {
		//如果结果集不为空
		if (resultSet!=null) {
				while (resultSet.next()) {
					printOneRow();
				}
		}else {
			System.out.println("结果集为null");
		}
	}
	/**
	 * 	打印一行记录的方法
	 * @throws SQLException 
	 */
	public void printOneRow() throws SQLException {
		for (int i = 1; i <= columns; i++) {
			Object con=resultSet.getObject(i);
			String content=null;
			if (content instanceof String) {
				content=(String)con;
			}else {
				content=con.toString();
			}
			printcontent(content);
		}
		
		System.out.println("|");
	}
	/**
	 * 	打印格式化后的内容的方法
	 * @throws SQLException 
	 */
	public void showResult() throws SQLException {
		//先打印一行符号
		printMark();
		//打印列名
		printColumnName();
		//打印一行符号
		printMark();
		//打印内容
		printcontent();
		//打印最后一行符号
		printMark();
	}
	/**
	 * 	打印表头的方法
	 * @throws SQLException 
	 */
	public void printTableHead() throws SQLException {
		// 先打印一行符号
		printMark();
		// 打印列名
		printColumnName();
		//打印符号
		printMark();
	}
	/**
	 * 	打印最后一行符号
	 */
	public void printend() {
		printMark();
	}
}
