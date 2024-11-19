import java.util.*;
import java.util.function.Consumer;

public class CollectionPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> a =new ArrayList<>();
		a.add("abc");
		a.add("xyz");
//		System.out.println(a);
		//for each loop
//		for(String str:a) {
//			System.out.println(str);
//		}
		//travarsing using ITERATOR
//		Iterator<String> itr= a.iterator();
		
//
//		while(itr.hasNext()) {
//			String next=itr.next();
//			System.out.println(next);
//			
//		}
		
//		ListIterator<String> lit=a.listIterator(a.size());
//		System.out.println(lit.hasPrevious());
//		while(lit.hasPrevious()) {
//			String prev=lit.previous();
//			System.out.println(prev);
//		}
//		Consumer<String> con=new Consumer<String>() {
//
//			@Override
//			public void accept(String t) {
//				System.out.println(t);
//				
//			}
//			
//		};
//		a.forEach(con);
		
		
//		a.forEach(t-> System.out.println(t.toUpperCase()));
		
		
//		System.out.println(a.get(1));
//		List<Integer> b=new LinkedList<>();
//		b.add(5);
//		a.remove("xyz");
//		System.out.println(a.size());
//		System.out.println(a.contains("abcz"));
//		System.out.println(a.isEmpty());
//		a.add(0,"pqr");
//		a.clear();
//		System.out.println(a);
//		Vector<String> vec=new Vector<>();
//		vec.add("a");
//		vec.add("a");
//		vec.add("a");
//		vec.add("a");
//		vec.add("a");
//		vec.add("a");
//		vec.add("a");
//		vec.add("a");
//		vec.add("a");
//		vec.add("a");
//		vec.add("a");
//		vec.add("a");
//		vec.add("a");
//		vec.add("a");
//		vec.addAll(a);
//		System.out.println(vec.capacity());
//		System.out.println(vec);
//		Set<Double> x=new HashSet<>();
//		x.add(14.12);
//		x.add(14.12);
//		x.add(12.01);
//		x.add(15.01);
//		System.out.println(x);
//		Set<Double>  x=new TreeSet<>();
//		x.add(14.12);
//		x.add(14.12);
//		x.add(12.01);
//		x.add(15.01);
//		System.out.println(x);
		
		Map<String,Integer>  course=new HashMap<>();
		course.put("Core Java", 4000);
		course.put("react", 4500);
//		System.out.println(course);
		course.forEach((e1,e2)->{
			System.out.println(e1+" => "+e2);
		});
		
		System.out.println(course.get("react"));
	}

}
