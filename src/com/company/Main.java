public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	   String s[]={"Первая строка","А вот как он эту отсортирует 2","строка 3","4 строка","пятая строка","adsfasdfasdfasdfasdfasdfasdfasdf","qwer","qwer2","А"};
	   sort(s);
	

		

	}
	public static void print(String[] arr){
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	
	public static void sort(String[] a){ //метод "Сортировка выбором"
		int k;
		String x;
		
		for(int  i=0; i < a.length; i++) {   	// i - номер текущего шага
		    k=i; x=a[i];

		    for(int j=i+1; j < a.length; j++)	// цикл выбора наименьшего элемента
		      if (a[j].compareTo(x) < 0 ) {
		        k=j; x=a[j];	        // k - индекс наименьшего элемента
		      }

		    a[k] = a[i]; a[i] = x;   	// меняем местами наименьший с a[i]
		  }
		print(a);
	}

}
