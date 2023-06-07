package Q9004;

public class Main {

	public static void main(String[] args) {
	
		//다이아몬드 폭 간격 설정
		int tabSize = 1;
		//다이아몬드 크기 설정
		int loopCount = 7;

		//만약 loopCount 짝수일 경우 같은 크기로 두번 찍어주기 위한 사이즈 조절
		int discount = (loopCount % 2 == 0) ? 1 : 0;
		int maxSize = (loopCount / 2) - discount;

		for (int i = 0; i < loopCount; ++i)
		{
			boolean isReverse = (i >= maxSize);
			int count = isReverse ? i : maxSize;
			int removeCount = isReverse ? maxSize : i;
			int outerDiscount = isReverse ? discount : 0;

			for (int outerSpaceCount = 0; outerSpaceCount < count - removeCount - outerDiscount; ++outerSpaceCount)
			{
				for (int empty = 0; empty < tabSize; ++empty)
				{
					System.out.print(" ");
				}
			}
			System.out.print("@");
			
			int innerSpaceCount = isReverse ? (loopCount - 1 - i) : i;
			innerSpaceCount *= 2;

			for (int spaceCount = 0; spaceCount < innerSpaceCount; ++spaceCount)
			{
				for (int empty = 0; empty < tabSize; ++empty)
				{
					System.out.print(" ");
				}
			}
			System.out.print("@\n");
		}

	}

}
