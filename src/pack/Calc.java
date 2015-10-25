package pack;/*Пакет (package) — это некий контейнер, который используется для того, чтобы изолировать имена классов. 
pack - название пакета */

public class Calc {
	static double double_100km, double_distance,double_price_1l, double_probeg_do, double_probeg_next, double_volume,
	double_fuel,double_pass_dist, double_sred_100km, double_n_l, double_price,double_dist;
	/* Переменные типа double - с плавающей точкой. служат для представления чисел, имеющих дробную часть */
	/*static позволяет определять статические методы. Это такие методы, которые являются общими для класса, а не для
	отдельного объекта этого класса. Также они могут работать лишь со статическими полями класса.К статическим методам 
	и переменным можно обращаться через имя класса.*/
	
	public static void Dan_dist() {/*Класс Calc_distance100km, который доступен для любого файла из пакета pack */
		/*  Модификатор доступа public означает, что метод виден и доступен любому классу.
	    static означает, что не нужно создавать экземпляр(копию) объекта Rasch в памяти, чтобы использовать этот метод.
	    void означает, что метод RacZarDanPer() не возвращает данных в программу, которая его вызвала.
	    Метод RacZarDanPer с пустыми скобками, это означает, что метод не имеет аргументов(параметров)
	    */
		if (Distance.CB_100km==0){ //если флажок Рассчитать автоматически на первой вкладке программы был выключен
			double_100km = Double.parseDouble(Distance.TextField_100km.getText());/* В переменную double_100km 
			записываются данные введеные пользователем в текстовое поле TextField_100km которое расположено в файле Distance.
			Преобразование данных в тип integer. */
		}
		double_distance = Double.parseDouble(Distance.TextField_distance.getText());
		double_price_1l = Double.parseDouble(Distance.TextField_price.getText());	/* В переменную  
		записываются данные введеные пользователем в текстовое поле которое расположено в файле Distance.
		Преобразование данных в тип integer. */
	}
	
	
	public static void Dan_dist_100km() {
		/*  Модификатор доступа public означает, что метод виден и доступен любому классу.
	    static означает, что не нужно создавать экземпляр(копию) объекта Rasch в памяти, чтобы использовать этот метод.
	    void означает, что метод не возвращает данных в программу, которая его вызвала.
	    Метод с пустыми скобками, это означает, что метод не имеет аргументов(параметров)   */
		if (Distance100km.CB_how_1==1){ // если выбран первый способ на вкладке На 100 км
		double_probeg_do = Double.parseDouble(Distance100km.TextField_probeg_do.getText());
		double_probeg_next = Double.parseDouble(Distance100km.TextField_probeg_next.getText());
		double_volume = Double.parseDouble(Distance100km.TextField_volume.getText());  /* В переменную  
		записываются данные введеные пользователем в текстовое поле которое расположено в файле Distance.
		Преобразование данных в тип integer. */
		
		} else { // если выбран второй способ на вкладке На 100 км
		double_fuel = Double.parseDouble(Distance100km.TextField_fuel.getText());
		double_pass_dist = Double.parseDouble(Distance100km.TextField_pass_dist.getText());  /* В переменную  
		записываются данные введеные пользователем в текстовое поле которое расположено в файле Distance.
		Преобразование данных в тип integer. */
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
