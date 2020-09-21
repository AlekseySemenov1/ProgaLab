public class Lab0
{
    public static void main(String[] args) 
    {
        short[] b = {19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2};
        float[] x = new float[14];
        for (int i=0;i<14;i++)
        {
            x[i] = (float) Math.random()*28-13;
        }
        double[][] d = new double[18][14];
        for (int i=0;i<18;i++)
        {
            for (int j=0;j<14;j++)
            {
                if (b[i]==4)
                   d[i][j]= Math.tan(x[j]*(Math.PI+x[j]))/3/4;
                else if (b[i]==2 || b[i]==3 || b[i]==5 || b[i]==7 && b[i]==8 || b[i]==9 || b[i]==11 || b[i]==17)
                {
                    d[i][j] = Math.pow (Math.E, Math.pow (1/(2*x[j]), x[j]))/ 0.5;
                }
                else
                {
                    d[i][j] = (Math.pow (Math.atan (1/Math.pow (Math.E, Math.abs(x[j]))), 1/3) + 1/4) / Math.atan (0.1* (Math.pow ((x[j]+0.5)/27, 2)));
                }
                System.out.printf("%.4f  ", d[i][j]);
            }
	    System.out.print("\n");
        }
  }
}