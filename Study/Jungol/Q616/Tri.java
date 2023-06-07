package Q616;

public class Tri 
{
	int XX1,YY1;//멤버변수 이클래스에서 유효
	int XX2,YY2;//선언된 멤버변수
	int XX3,YY3;
	
	public Tri(int px1,int py1,int px2, int py2, int px3, int py3)
	{
		XX1 = px1; //위 선언된 멤버변수 파라미터값을 대입
		YY1 = py1; //6개의 생성자 만듬 
		XX2 = px2; //리턴값은 오로지 한개값만 나올수있음.
		YY2 = py2;
		XX3 = px3;
		YY3 = py3;
	}
	
	public Tri(int x1,int x2, int x3) {
		XX1 = x1;
		XX2 = x2;
		XX3 = x3;
		
	}
	public Tri() {
		XX1 = 1;
		XX2 = 2;
	}
	//메소드를 2개만들때 x에대한 무게중심 , y에 대한 무게중심
	//x에 대한 무게중심
	public double getCoGX() 
	{
		double res = (XX1 + XX2 + XX3) /(double)3;
		return res; //리턴값이 날라감
	}
	public double getCoGY() 
	{
		double res = (YY1 + YY2 + YY3) /(double)3;
		return res; //리턴값이 날라감
	}
	public void SetX1(int px1)
	{
		XX1 = px1;
	}
	public void SetX2(int px1)
	{
		XX1 = px1;
	}
//다른 외부에서 getCoG로 출력할대 double의 값으로 리턴된다
}