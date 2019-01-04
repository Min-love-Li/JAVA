package page;
class Cz
{
		void max(int a,int b,int c)
		{
			if(a>b&&a>c)
				System.out.println(a);
		    else if(c>a&&c>b)
		    	System.out.println(c);
			else
				System.out.println(b);
		}
		void max(long a,long b,long c)
		{
			if(a>b&&a>c)
				System.out.println(a);
		    else if(c>a&&c>b)
		    	System.out.println(c);
			else
				System.out.println(b);
		}
		void max(float a,float b,float c)
		{
			if(a>b&&a>c)
				System.out.println(a);
		    else if(c>a&&c>b)
		    	System.out.println(c);
			else
				System.out.println(b);
		}
		static void min(int a,int b,int c)
		{
			if(a<b&&a<c)
				System.out.println(a);
			if(b<a&&b<c)
				System.out.println(b);
			else
				System.out.println(c);
		}
		static void min(long a,long b,long c)
		{
			if(a<b&&a<c)
				System.out.println(a);
			if(b<a&&b<c)
				System.out.println(b);
			else
				System.out.println(c);
		}
		static void min(float a,float b,float c)
		{
			if(a<b&&a<c)
				System.out.println(a);
			if(b<a&&b<c)
				System.out.println(b);
			else
				System.out.println(c);
		}

		public static void main(String args[])
		{
			Cz c=new Cz();
			c.max(23, 12, 3);
			c.max(45l, 34l, 2l);
			c.max(20.99f, 32.12f, 2.2f);
			min(23, 12, 3);
			min(45l, 34l, 2l);
			min(20.99f, 32.12f, 2.2f);
			 
		}
}
