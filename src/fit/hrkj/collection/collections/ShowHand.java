package fit.hrkj.collection.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 梭哈游戏<br>
 * 2019年7月26日 下午4:51:18
 * 
 * @author 华软科技
 * @version 1.0
 */
public class ShowHand {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShowHand sh = new ShowHand();
		sh.initPlayer("唐僧", "孙悟空", "猪八戒", "沙悟净", "白龙马");
		sh.initCards();
		sh.initPlayerCards();
		// 下面测试所有扑克牌,没有实际作用
//		sh.showAllCards();
		// 下面从孙悟空开始发牌
		sh.deliverCard("孙悟空", 5);
		sh.showPlayerCards();
		/*
		 * (可跳过)这个地方需要增加处理: 1.牌面最大的玩家下注 2.其他玩家是否跟注 3.游戏是否只剩下一个玩家?如果是,则他胜利
		 * 4.如果已经是最后一张扑克牌,则需要比较剩下玩家的牌面大小
		 */
		// 直接比较大小
		sh.lookForWinner();

	}

	/**
	 * 比较玩家手中的牌,分胜负,比较规则:同花顺>四条>满堂红>同花>顺子>三条>二对>单对>散牌。
	 */
	private void lookForWinner() {
		// TODO Auto-generated method stub
		System.out.println("作业:实现比较逻辑!");
	}

	/**
	 * 定义该游戏最多支持多少个玩家
	 */
	private final int PLAYER_NUM = 5;
	/**
	 * 定义扑克牌的所有花色和数值
	 */
	private String[] types = { "方块", "草花", "红心", "黑桃" };
	private String[] values = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
	/**
	 * cards是一局游戏中剩下的扑克牌
	 */
	private LinkedList<String> cards = new LinkedList<String>();
	/**
	 * 定义所有的玩家的玩家
	 */
	private String[] players = new String[PLAYER_NUM];
	/**
	 * 所有玩家手上的扑克牌
	 */
	private List<String>[] playersCards = new List[PLAYER_NUM];

	/**
	 * 初始化扑克牌,放入52张扑克牌并且使用shuffle方法将它们按随机顺序排列
	 */
	public void initCards() {
		// 遍历扑克牌的花色
		for (int i = 0; i < types.length; i++) {
			// 遍历每种花色的数值
			for (int j = 0; j < values.length; j++) {
				cards.add(types[i] + values[j]);
			}
		}
		// 随机排列
		Collections.shuffle(cards);

	}

	/**
	 * 初始化玩家,为每个玩家分派用户名
	 * 
	 * @param names
	 */
	public void initPlayer(String... names) {
		// 校验玩家数量
		if (names.length > PLAYER_NUM || names.length < 2) {
			System.out.println("玩家数量不对");
			return;
		} else {
			// 初始化玩家用户名
			for (int i = 0; i < names.length; i++) {
				players[i] = names[i];
			}
		}
	}

	/**
	 * 初始化玩家手上的扑克牌,开始游戏时每个玩家手上的扑克牌为空 程序使用一个长度为0的LinkedList来表示
	 */
	public void initPlayerCards() {
		// 遍历每个玩家
		for (int i = 0; i < players.length; i++) {
			// 玩家名字不为空
			if (players[i] != null && !players[i].equals("")) {
				// 给每个玩家分配扑克牌,初始值为0张
				playersCards[i] = new LinkedList<String>();
			}
		}
	}

	/**
	 * 输出全部扑克牌,该方法没实际作用,仅用于测试
	 */
	public void showAllCards() {
		System.out.println("开始打印全部扑克牌:");
		for (String card : cards) {
			System.out.println(card);
		}
	}

	/**
	 * 发牌
	 * 
	 * @param firString 最先发给谁
	 * @param count     发几轮牌
	 */
	public void deliverCard(String firstPlayer, int count) {
		// 先对玩家数组排序,否则无法通过Arrays.binarySearch方法获取玩家索引
		Arrays.parallelSort(players);
		// 查询出指定元素在数组中的索引
		int firstPos = Arrays.binarySearch(players, firstPlayer);

		// 也可以使用for循环获取玩家的索引
//		int firstPos = 0;
//		for (int i = 0; i < players.length; i++) {
//			if (firstPlayer != null && players[i] != null && firstPlayer.equals(players[i])) {
//				firstPos = i;
//			}
//		}
		// 发count轮牌
		for (int c = 0; c < count; c++) {

			// 依次给位于该指定玩家之后的每个玩家发牌
			for (int i = firstPos; i < players.length; i++) {
				if (players[i] != null) {
					playersCards[i].add(cards.pop());
				}
			}
			// 依次给位于指定玩家之前的每个玩家发牌
			for (int i = 0; i < firstPos; i++) {
				if (players[i] != null) {
					playersCards[i].add(cards.pop());
				}
			}
		}
	}

	/**
	 * 输出玩家手上的扑克牌 实现该方法时,应该控制每个玩家看不到别人的第一张牌,但此处没有增加该功能
	 */
	public void showPlayerCards() {
		for (int i = 0; i < players.length; i++) {
			// 当该玩家不为空时
			if (players[i] != null) {
				// 输出玩家
				System.out.print(players[i] + ":\t(暗牌)");
				// 遍历输出玩家手上的扑克牌
				for (String card : playersCards[i]) {
					System.out.print(card + "\t");
				}
			}
			System.out.print("\n");
		}

	}

}
