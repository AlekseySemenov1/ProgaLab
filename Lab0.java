public class Lab0
{
    public static float rand()
    {
        return (float) Math.random()*28-13;
    }
    
    public static double form1(float a)
    {
        return Math.tan(a*(Math.PI+a))/3/4;
    }
    
    public static double form2(float a)
    {
        return Math.pow (Math.E, Math.pow (1/(2*a), a))/ 0.5;
    }
    
    public static double form3(float a)
    {
        return (Math.pow (Math.atan (1/Math.pow (Math.E, Math.abs(a))), 1/3) + 1/4) / Math.atan (0.1* (Math.pow ((a+0.5)/27, 2)));
    }
    
    public static void main (String[] args) 
    {
        final int q=14, w=18;
        short[] b = new short[w];
        float[] x = new float[q];
        for (int i=0;i<w;i++)
            b[i] = (short) (w-i+1);
        for (int i=0;i<q;i++)
        {
            x[i] = rand();
        }
        double[][] d = new double[w][q];
        for (int i=0;i<w;i++)
        {
            for (int j=0;j<q;j++)
            {
                if (b[i]==4)
                   d[i][j]= form1(x[j]);
                else if (b[i]==2 || b[i]==3 || b[i]==5 || b[i]==7 || b[i]==8 || b[i]==9 || b[i]==11 || b[i]==17)
                {
                    d[i][j] = form2(x[j]);
                }
                else
                {
                    d[i][j] = form3(x[j]);
                }
                System.out.printf("%.4f  ", d[i][j]);
            }
	    System.out.print("\n");
        }
    }
}
