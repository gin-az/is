package pack;/*Пакет (package) — это некий контейнер, который используется для того, чтобы изолировать имена классов. 
pack - название пакета */

import java.awt.*;/*	java. - Все стандартные классы, поставляемые с системой Java, хранятся в пакете java.
java.awt  - подключение пакета awt, содержащего базовые графические функции:GridLayout, BorderLayout и т.д.
"*"-включение всех элементов библиотеки awt */	
import java.awt.event.*;/*Подключаем объект event, который содержит свойства, описывающие некое событие.
Каждый раз, когда происходит какое-либо событие, 
объект Event передается соответствующей программе обработки.
Используемым событием в нашей программе являются ACTION события.
*/
import javax.swing.*;// библиотека для графического интерфейса
import javax.swing.border.*;//библиотека необходимая для того, чтобы установить отступы


public class Calc_distance100km extends JDialog {/*Класс Calc_distance100km, который доступен для любого файла из пакета pack наследует 
	функции элемента JDialog */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {/*  
		Модификатор доступа public означает, что метод main(String[] args)виден и доступен любому классу. 
		static позволяет определять статические методы. Это такие методы, которые являются общими для класса, а не для
		отдельного объекта этого класса. Также они могут работать лишь со статическими полями класса.К статическим методам 
		и переменным можно обращаться через имя класса.
		void означает, что метод main(String[] args)не возвращает данных в программу, которая его вызвала, 
		а просто выводит на экран строку.
		В методе main слова String[] args означают,что этот может получать массив объектов с типом String, т.е. текстовые данные.
		Программа может состоять из нескольких классов, но только один из них содержит метод main().
		Все существующие реализации Java-интерпретаторов, получив команду интерпретировать класс, 
		начинают свою работу с вызова метода main. 
		*/
		try {/* Для задания блока программного кода, который требуется защитить от исключений, используется ключевое слово try. 
			Сразу же после try-блока помещается блок catch, задающий тип исключения которое вы хотите обрабатывать.
			Исключение – это проблемная ситуация, возникающая по мере выполнения кода программы. Работает она так:
			1.Выполняется код внутри блока try. 2.Если в нём ошибок нет, то блок catch(err) игнорируется, то есть выполнение 
			доходит до конца try и потом прыгает через catch. 3.Если в нём возникнет ошибка, то выполнение try на ней
			 прерывается, и управление прыгает в начало блока catch(err).
			*/
			Calc_distance100km Calc_distance100km = new Calc_distance100km();
			Calc_distance100km.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//при закрытии формы происходит выход из приложения
			Calc_distance100km.setVisible(true);//устанавливаем что окно видимое
			Calc.Calcul_distance_100km(); //рассчитваем необходимые данные. Функция расположена в файле Calc
		} catch (Exception e) {
			/* Для задания блока программного кода, который требуется защитить от исключений, используется ключевое слово try. 
			Сразу же после try-блока помещается блок catch, задающий тип исключения которое вы хотите обрабатывать.
			Исключение – это проблемная ситуация, возникающая по мере выполнения кода программы. Работает она так:
			1.Выполняется код внутри блока try. 2.Если в нём ошибок нет, то блок catch(err) игнорируется, то есть выполнение 
			доходит до конца try и потом прыгает через catch. 3.Если в нём возникнет ошибка, то выполнение try на ней
			 прерывается, и управление прыгает в начало блока catch(err).
			*/
			e.printStackTrace();
		}
	}

	public static JLabel Label_100km, Label_dist, Label_fuel;//текстовые поля,доступные из любого файла пакета pack
	/*static позволяет определять статические методы. Это такие методы, которые являются общими для класса, а не для
отдельного объекта этого класса. Также они могут работать лишь со статическими полями класса.К статическим методам 
и переменным можно обращаться через имя класса.*/
	public Calc_distance100km() {//метод, описывающий какие поля и кнопки располагаются на JDialog


		setTitle("Расчет расхода топлива на 100 километров"); //устанавливаем заголовок окна
		setSize(430, 440); // указывает ширину и высоту.
		setLocationRelativeTo(null);//установить посередине экрана
		setResizable(false); //запрет на расширение окна 
		
		getContentPane().setLayout(new BorderLayout());// для данной панели устанавливается менеджер компоновки BorderLayout
		 /*	Оператор new создает экземпляр указанного класса
	  	Метод setLayout - Вызов менеджера компоновки, который задает определенный порядок панелей в контейнере.
 		Менеджер размещения BorderLayout - тип разбивки контейнера, при котором всё пространство контейнера разбивается 
 		на пять частей. В каждой из этих частей располагается один компонент. 
 		При добавлении компонента на контейнер с BorderLayout разработчик обязательно указывает, 
 		куда именно он хочет поместить компонент.*/
		
		JPanel buttonPane = new JPanel();/*  Создание новой компоненты  панели  */
		getContentPane().add(buttonPane, BorderLayout.SOUTH);//Добавление на главную панель, вниз.
		
		buttonPane.setLayout(new GridLayout(1, 2, 10, 5));/*установка менеджера компоновки GridLayout.
		На панеле будет 1 строка,2столбца, расстояние между столбцами - 10 */
		
		JButton Button_delete = new JButton("Очистить результаты");/*В скобках надпись на кнопке*/
		buttonPane.add(Button_delete);/*  Добавление кнопки в панель */
			
		JButton Button_exit = new JButton("Закрыть");
		buttonPane.add(Button_exit);
		
		JPanel panel = new JPanel();/*  Создание новой панели  */
		getContentPane().add(panel, BorderLayout.CENTER);//Добавление на главную панель, в центр

		panel.setLayout(new FlowLayout(FlowLayout.LEFT, 7, 15));
		/*setLayout-Вызов менеджера компоновки, который задает определенный порядок панелей в Panel_text.
      	Менеджер размещения FlowLayout размещает компоненты подобно тому как текстовый редактор располагает слова. 
      	Компоненты располагаются друг за другом слева направо и сверху вниз, начиная с левого верхнего угла. 
      	Если строка заполнена и следующий компонент в ней не помещается, то он переносится на новую строку. 
      	Вокруг каждого компонента оставляется небольшое свободное пространство.
       	Оператор new создает экземпляр указанного класса 
       	7 - горизонтальный отступ, 15 - вертикальный */
		panel.setBorder(new EmptyBorder(74,0,123,0));//установка внутренних отступов(74 сверху,123 снизу)

        Font font = new Font(null, Font.BOLD, 13);//создание нового шрифта. Шрифт жирный, размер 13

		JLabel Label_1 = new JLabel("Автомобиль проехал");
		panel.add(Label_1);//добавить на панель, add - метод добавления компоненты в контейнер.
				
		Label_dist = new JLabel("");//для отображения рассчитанного значения пройденного расстояния
		panel.add(Label_dist);//добавить на панель, add - метод добавления компоненты в контейнер.
		Label_dist.setFont(font);
		Label_dist.setForeground(Color.BLUE);
		/*setFont - устанавливаем ля данного компонента шрифт font, 
		 setForeground -  цвет шрифта синий*/
		
		JLabel Label_2 = new JLabel("км");
		panel.add(Label_2);//добавить на панель, add - метод добавления компоненты в контейнер.
		
		JLabel Label_3 = new JLabel("используя");
		panel.add(Label_3);//добавить на панель, add - метод добавления компоненты в контейнер.
				
		Label_fuel = new JLabel("");//для отображения рассчитанного значения израсходованного топлива
		panel.add(Label_fuel);//добавить на панель, add - метод добавления компоненты в контейнер.
		Label_fuel.setFont(font);
		Label_fuel.setForeground(Color.BLUE);
		/*setFont - устанавливаем ля данного компонента шрифт font, 
		 setForeground -  цвет шрифта синий*/
		
		JLabel Label_4 = new JLabel("л.");
		panel.add(Label_4);//добавить на панель, add - метод добавления компоненты в контейнер.
		
		JLabel Label_5 = new JLabel("Значит, средний расход топлива на 100 км составляет");
		panel.add(Label_5);//добавить на панель, add - метод добавления компоненты в контейнер.
				
		
		Label_100km = new JLabel("");//для отображения рассчитанного значения средний расход топлива
		panel.add(Label_100km);//добавить на панель, add - метод добавления компоненты в контейнер.
		Label_100km.setFont(font);
		Label_100km.setForeground(Color.BLUE);
		/*setFont - устанавливаем ля данного компонента шрифт font, 
		 setForeground -  цвет шрифта синий*/
		
		JLabel Label_6 = new JLabel("л топлива.");
		panel.add(Label_6);//добавить на панель, add - метод добавления компоненты в контейнер.
				
		
		Button_exit.addActionListener(new ActionListener() //добавляем слушателя события для кнопки 
				/*      "."  - указывает к какой переменной (кнопке) следует применить слушателя.
			 	addActionListener - добавление слушателя ActionListener к кнопке
			  	new - Оператор new создает экземпляр указанного класса 
			  	(Для того чтобы кнопки стали функциональными, каждой из них необходимо присвоить обработчик событий, 
			  	который будет отвечать за реагирование на события. 
			  	В нашем случае требуется идентифицировать событие нажатия кнопки – путем щелчка мышью. 
			  	Поэтому будет использоваться интерфейс "ActionListener", 
			  	предназначенный для обработки событий "ActionEvent".
			  	тело интерфейса указывается ниже после фигурной скобки "{"
	    	    */                            
		   {                                                         
		    public void actionPerformed(ActionEvent e)  
		    /* 	ActionListener" имеет метод "actionPerformed" объекта "ActionEvent", 
	      	который реализуется путем простого вызова обработчика событий ActionPerformed.
	      	Ключевое слово public означает, что метод actionPerformed() доступен для любого другого класса Java
	      	Ключевое слово void означает, что метод main() не возвращает данных в программу, которая его вызвала. 
	      	*/  
		    
		    {    // описывается что будет происходить при нажатии на кнопку Закрыть - программа завершит свою работу
	            System.exit(0);		    	
		    }                                                        
		   }); 
		

		
		Button_delete.addActionListener(new ActionListener()   //добавляем слушателя события для кнопки 
				/*      "."  - указывает к какой переменной (кнопке) следует применить слушателя.
			 	addActionListener - добавление слушателя ActionListener к кнопке
			  	new - Оператор new создает экземпляр указанного класса 
			  	(Для того чтобы кнопки стали функциональными, каждой из них необходимо присвоить обработчик событий, 
			  	который будет отвечать за реагирование на события. 
			  	В нашем случае требуется идентифицировать событие нажатия кнопки – путем щелчка мышью. 
			  	Поэтому будет использоваться интерфейс "ActionListener", 
			  	предназначенный для обработки событий "ActionEvent".
			  	тело интерфейса указывается ниже после фигурной скобки "{"
	    	    */                          
		   {        
			  public void actionPerformed(ActionEvent e)               
			  {
				  /* 	ActionListener" имеет метод "actionPerformed" объекта "ActionEvent", 
			      	который реализуется путем простого вызова обработчика событий ActionPerformed.
			      	Ключевое слово public означает, что метод actionPerformed() доступен для любого другого класса Java
			      	Ключевое слово void означает, что метод main() не возвращает данных в программу, которая его вызвала. 
			      	*/    
				  
				setVisible(false);//данное окно станет невидимым
		    	Index.Index.setVisible(true);/*устанавливаем что окно Расчет расхода топлива в котором пользователь 
		    	вводит данные видимое */
		    	
		    	//	Обнуляем все поля, переменные, флажки ставим в состояние выключен
		    	Distance.TextField_100km.setText("");
		    	Distance.TextField_distance.setText("");
		    	Distance.TextField_price.setText("");
		    	Distance.CheckBox_100km.setSelected(false);
		    	Distance.CB_100km=0;
		    			
		    	Distance100km.TextField_probeg_do.setText("");
		    	Distance100km.TextField_probeg_next.setText("");
		    	Distance100km.TextField_volume.setText("");
		    	Distance100km.TextField_fuel.setText("");
		    	Distance100km.TextField_pass_dist.setText("");
		    	Distance100km.CheckBox_how_1.setSelected(false);
		    	Distance100km.CheckBox_how_2.setSelected(false);
		    	Distance100km.CB_how_1=0;
		    	Distance100km.CB_how_2=0;

			    Index.JTP.setSelectedIndex(0);//устанавливаем что программа должна открыться на вкладке 0
		    }                                                        
		   }); 
	}
	
	
	
	
	
	}
	
	 	
	
