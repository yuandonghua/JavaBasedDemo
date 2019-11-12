package fit.hrkj.object;

public class CacheImmutableTest {

	 public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        CacheImmutable c1 = CacheImmutable.valueOf("java");//0  pos=1
	        CacheImmutable c2 = CacheImmutable.valueOf("java");
	        CacheImmutable c3 = CacheImmutable.valueOf("android");//1 pos=2
	        CacheImmutable c4 = CacheImmutable.valueOf("h5");//2
	        CacheImmutable c5 = CacheImmutable.valueOf("android1");//3
	        CacheImmutable c6 = CacheImmutable.valueOf("android2");//4
	        CacheImmutable c7 = CacheImmutable.valueOf("android3");//5
	        CacheImmutable c8 = CacheImmutable.valueOf("android4");//6
	        CacheImmutable c9 = CacheImmutable.valueOf("android5");//7
	        CacheImmutable c10 = CacheImmutable.valueOf("android6");//8
	        CacheImmutable c11 = CacheImmutable.valueOf("android7");//9 pos=10
	        CacheImmutable c12 = CacheImmutable.valueOf("android8");//0 pos=1
	        CacheImmutable c13 = CacheImmutable.valueOf("android8");//0 pos=1
	        CacheImmutable c14 = CacheImmutable.valueOf("android9");//1 pos=2
	        
	        CacheImmutable c41=new CacheImmutable("java");
	        
	        System.out.println(c1 == c2);
	        
	        System.out.println(c1 == c41);
	        
	        System.out.println(c1.equals(c2));
	        System.out.println(c1.equals(c41));
	        
	        
	        
	    }

	}

	class CacheImmutable {
	    private static int MAX_SIZE = 10;
	    // 使用数组来缓存已有的实例
	    private static CacheImmutable[] cache = new CacheImmutable[MAX_SIZE];
	    // 记录缓存实例在缓存中的位置,cache[pos-1]是最新缓存的实例
	    private static int pos = 0;
	    private final String name;
	    private int count=0;

	    public CacheImmutable(String name) {
	        this.name = name;
	    }

	    public String getName() {
	        return name;
	    }

	    public static CacheImmutable valueOf(String name) {
	        // 遍历已缓存的对象
	        for (int i = 0; i < MAX_SIZE; i++) {
	            // 如果已有相同实例,则直接返回该缓存的实例
	            if (cache[i] != null && cache[i].getName().equals(name)) {
	                return cache[i];
	            }
	        }
	        // 如果缓存池已满
	        if (pos == MAX_SIZE) {
	            // 把缓存的第一个对象覆盖,即把刚刚生成的对象放在缓存池的最开始位置
	            cache[0] = new CacheImmutable(name);
	            // 把pos设为1
	            pos = 1;
	        } else {
	            // 把新创建的对象缓存起来,pos加1
	            cache[pos++] = new CacheImmutable(name);
	        }
	        return cache[pos - 1];
	    }

	    public boolean equals(Object object) {
	        if (this == object) {
	            return true;
	        }
	        if (object != null && object.getClass() == CacheImmutable.class) {

	            CacheImmutable c = (CacheImmutable) object;

	            return name.equals(c.getName());

	        }
	        return false;
	    }

	    public int hashCode() {
	        return name.hashCode();
	    }

	}