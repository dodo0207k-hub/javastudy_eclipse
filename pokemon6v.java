package javastudy;

public class javastudy_pokemon6v {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int v = (int)(Math.random() * 30 + 1);
		int v2 = (int)(Math.random() * 30 + 1);
		int v3 = (int)(Math.random() * 30 + 1);
		int v4 = (int)(Math.random() * 30 + 1);
		int v5 = (int)(Math.random() * 30 + 1);
		int v6 = (int)(Math.random() * 30 + 1);
		*/
		int[] v = new int[6];
		for(int i = 0; i < 6; i++)
		{
			v[i] = (int)(Math.random() * 30 + 1);
		}
		javastudy_pokemon pikachu = new javastudy_pokemon("pikachu", v[0], v[1], v[2], v[3], v[4], v[5]);
		pikachu.show();
	}

}
