package InterfacePrac;

interface IFifth {
	void show();
}

//class Fifth implements IFifth {
//
//	@Override
//	public void show() {
//		System.out.println("In Fifth");
//
//	}
//
//}

public class AdvInterface2 {
	public static void main(String[] args) {
//		IFifth f=new Fifth();
//		f.show();
		
//		IFifth f=new IFifth() {
//
//			@Override
//			public void show() {
//				System.out.println("In Fifth");				
//			}
//			
//		} ;
		
		IFifth f=()->System.out.println("In Fifth");				
		f.show();
	}
}
