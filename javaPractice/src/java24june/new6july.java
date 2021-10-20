package java24june;

public class new6july {

	
		class Book
		{
			private static int counter;
			private String name;
			private String author;

			Book(String name, String author)
			{
				this.name = name;
				this.author = author;
			} 

			public static int getInstanceCount()
			{
				return counter ;
			}
		}
	}


