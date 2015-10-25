package pack;/*Пакет (package) — это некий контейнер, который используется для того, чтобы изолировать имена классов. 
pack - название пакета */

import javax.swing.*; // библиотека для графического интерфейса
import javax.swing.border.*;//библиотека необходимая для того, чтобы установить отступы 
import java.awt.event.*; /*Подключаем объект event, который содержит свойства, описывающие некое событие.
Каждый раз, когда происходит какое-либо событие, 
объект Event передается соответствующей программе обработки.
Используемым событием в нашей программе являются ACTION события.
*/
import java.awt.*; /*	java. - Все стандартные классы, поставляемые с системой Java, хранятся в пакете java.
java.awt  - подключение пакета awt, содержащего базовые графические функции:GridLayout, BorderLayout и т.д.
"*"-включение всех элементов библиотеки awt */	


public class Distance100km extends JPanel  {/*Класс Distance100km, который доступен для любого файла из пакета pack наследует 
	функции элемента JPanel */
		private static final long serialVersionUID = 1L;
		
	private JPanel Panel_Text, Panel_Button,Panel_Text_1;//панели на которых располагаются поля и кнопки. Панели доступны только для данного класса (private)
	private JButton Button_Calc_100km;// кнопка Рассчитать которая доступна только для данного класса
	private JLabel Label_0,Label_1,Label_2,Label_3,Label_4, Label_5,Label_6,Label_7;// Панели на которых располагается текст, например "Расход топлива на 100 км (л): "
	public static JTextField TextField_probeg_do, TextField_probeg_next,TextField_volume, TextField_fuel,TextField_pass_dist;/* текстовые поля в которые пользователь 
	вводит данные, доступны для любого файла из пакета pack */
	public static JCheckBox CheckBox_how_1, CheckBox_how_2;// компонент флажок
	public static int CB_how_1, CB_how_2;//переменные типа integer, доступная любому классу
	/*static позволяет определять статические методы. Это такие методы, которые являются общими для класса, а не для
отдельного объекта этого класса. Также они могут работать лишь со статическими полями класса.К статическим методам 
и переменным можно обращаться через имя класса.*/
	
	
	public Distance100km()  {  //метод, описывающий какие поля и кнопки располагаются на панели
		setLayout (new BorderLayout());/*	Оператор new создает экземпляр указанного класса
	  	Метод setLayout - Вызов менеджера компоновки, который задает определенный порядок панелей в контейнере.
 		Менеджер размещения BorderLayout - тип разбивки контейнера, при котором всё пространство контейнера разбивается 
 		на пять частей. В каждой из этих частей располагается один компонент. 
 		При добавлении компонента на контейнер с BorderLayout разработчик обязательно указывает, 
 		куда именно он хочет поместить компонент.*/
		
		Panel_Text = new JPanel();//Панель на которой располагается текстовое поля "Выберите ..."
		Panel_Text_1 = new JPanel();//Панель на которой располагаются текстовые поля и поля для ввода текста
		Panel_Button = new JPanel();//Панель на которой располагается кнопка

		add(Panel_Text, BorderLayout.NORTH);//Добавление панели Panel_Text наверх
		add(Panel_Text_1, BorderLayout.CENTER);//Добавление панели по центру
		add(Panel_Button, BorderLayout.SOUTH);//Добавление панели вниз
		
		Panel_Text.setLayout(new GridLayout(1,1));// на панеле будет 1строка,1строчка
		Panel_Text_1.setLayout(new GridLayout(7,2,10,10));// на панеле будет 7 строк, 2 столбца, расстояние между столбцами 10, расстояние между строками 10
		Panel_Button.setLayout(new GridLayout(1,1));// на панеле будет 1строка,1строчка
		
		Panel_Text.setBorder(new EmptyBorder(10,7,7,7));//отступ - 10 сверху, 7 слева, 7 снизу, 7 справа
		Panel_Text_1.setBorder(new EmptyBorder(0,7,45,7));//внутренние отступы

		
		Label_0 = new JLabel("Выберите способ измерения: ");
		Label_1 = new JLabel("1. 'От полного бака' ");
		Label_2 = new JLabel("  Зафиксированный пробег (км):", JLabel.RIGHT);
		Label_3 = new JLabel("  Последний пробег (км): ", JLabel.RIGHT);
		Label_4 = new JLabel("  Объем бака (л):", JLabel.RIGHT);
		Label_5 = new JLabel("2. 'Пройденное расстояние' ");
		Label_6 = new JLabel("  Израсходовано топлива (л):", JLabel.RIGHT);
		Label_7 = new JLabel("  Пройденное расстояние (км):", JLabel.RIGHT);
		/*Обозначаем что переменные Label_1,Label_2..являются объектом JLabel и указываем какой текст будет выводиться.
		JLabel.RIGHT - выравнивание по правому краю	*/
		
		Button_Calc_100km = new JButton("Рассчитать расход топлива");//В скобках - надпись на кнопке
		
		
		CheckBox_how_1 = new JCheckBox();//компонент флажок 
		CheckBox_how_1.setToolTipText("Выбрать способ измерения 'От полного бака'");
		/* setToolTipText - подсказка, которая показывается при наведении на элемент CheckBox_100km(компонент флажок)*/

		CheckBox_how_2 = new JCheckBox();//компонент флажок 
		CheckBox_how_2.setToolTipText("Выбрать способ измерения 'Пройденное расстояние'");
		/* setToolTipText - подсказка, которая показывается при наведении на элемент CheckBox_100km(компонент флажок)*/

		TextField_probeg_do = new JTextField();
		TextField_probeg_do.setMargin(new Insets(2, 5, 2, 5));//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
		TextField_probeg_do.setToolTipText("Введите пробег, зафиксированный перед использованием автомобиля с полным баком");//всплывающая подсказка при наведении на текстовое поле
    	
		TextField_probeg_next = new JTextField();
		TextField_probeg_next.setMargin(new Insets(2, 5, 2, 5));//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
		TextField_probeg_next.setToolTipText("Введите последний пробег");//всплывающая подсказка при наведении на текстовое поле
    			
		TextField_volume = new JTextField();
		TextField_volume.setMargin(new Insets(2, 5, 2, 5));//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
		TextField_volume.setToolTipText("Введите объем бака");//всплывающая подсказка при наведении на текстовое поле
    			
		TextField_fuel = new JTextField();
		TextField_fuel.setMargin(new Insets(2, 5, 2, 5));//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
		TextField_fuel.setToolTipText("Введите сколько топлива было израсходовано");//всплывающая подсказка при наведении на текстовое поле
    			
		TextField_pass_dist = new JTextField();
		TextField_pass_dist.setMargin(new Insets(2, 5, 2, 5));//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
		TextField_pass_dist.setToolTipText("Введите пройденное расстояние");//всплывающая подсказка при наведении на текстовое поле
    			
		/* Добавление кнопки, текстовых полей, полей для ввода текста на панели*/
		Panel_Button.add(Button_Calc_100km);
		Panel_Text.add(Label_0);
		Panel_Text_1.add(Label_1);
		Panel_Text_1.add(CheckBox_how_1);
		Panel_Text_1.add(Label_2);
		Panel_Text_1.add(TextField_probeg_do);
		Panel_Text_1.add(Label_3);
		Panel_Text_1.add(TextField_probeg_next);
		Panel_Text_1.add(Label_4);
		Panel_Text_1.add(TextField_volume);
		Panel_Text_1.add(Label_5);
		Panel_Text_1.add(CheckBox_how_2);
		Panel_Text_1.add(Label_6);
		Panel_Text_1.add(TextField_fuel);
		Panel_Text_1.add(Label_7);
		Panel_Text_1.add(TextField_pass_dist);


		CheckBox_how_1.addItemListener(new ItemListener(){   /*Для компонента флажок устанавливаем слушатель события                                                        
			Если нажать на компонент - сработает проверка выбран флажок или снят */                                                     
			public void itemStateChanged(ItemEvent e) 
			/*. В теле метода itemStateChanged располагается код, который выполняется при смене состояния флажка. */
			{
				if (e.getSource()==CheckBox_how_1)//если событие произошло именно с флажком CheckBox_how_1, то выполняется следующее
					if(e.getStateChange()==1){ /* Если данный компонент флажок включен (==1), то это означает что выбран 
					первый способ, а значит поля для ввода текста для второго способа становятся недоступными. И флажок для 
					второго способа устанавливается в положение выключен  */
						TextField_fuel.setEditable(false);
						TextField_pass_dist.setEditable(false);
						CheckBox_how_2.setSelected(false);
						CB_how_1=1; //переменная указывающая выбран первый способ или нет. 0 -не выбран,1 - выбран
						CB_how_2=0;//переменная указывающая выбран второй способ или нет. 
						}
					else { //если флажок выключен, то поля для ввода текста для второго способа становятся доступными
						TextField_fuel.setEditable(true);
						TextField_pass_dist.setEditable(true);
						CB_how_1=0; //переменная указывающая выбран первый способ или нет. 0 -не выбран,1 - выбран
						}
			}                                                       
    	   }); 	
		
		CheckBox_how_2.addItemListener(new ItemListener(){ /*Для компонента флажок устанавливаем слушатель события                                                         
						Если нажать на компонент - сработает проверка выбран флажок или снят */                                                     
			public void itemStateChanged(ItemEvent e)
			/* В теле метода itemStateChanged располагается код, который выполняется при смене состояния флажка. */
			{
				if (e.getSource()==CheckBox_how_2)//если событие произошло именно с данным флажком, то выполняется следующее
					if(e.getStateChange()==1){ /* Если данный компонент флажок включен (==1), то это означает что выбран 
						второй способ, а значит поля для ввода текста для первого способа становятся недоступными. И флажок для 
						первого способа устанавливается в положение выключен  */
						TextField_probeg_do.setEditable(false);
						TextField_probeg_next.setEditable(false);
						TextField_volume.setEditable(false);
						CheckBox_how_1.setSelected(false);	
						CB_how_1=0;//переменная указывающая выбран первый способ или нет. 0 -не выбран,1 - выбран
						CB_how_2=1;//переменная указывающая выбран второй способ или нет.
					}
					else {//если флажок выключен, то поля для ввода текста для первого способа становятся доступными
						TextField_probeg_do.setEditable(true);
						TextField_probeg_next.setEditable(true);
						TextField_volume.setEditable(true);
						CB_how_2=0;//переменная указывающая выбран второй способ или нет. 0 -не выбран,1 - выбран
						}
			}                                                       
    	   }); 	
		
		

		

		Button_Calc_100km.addActionListener(new ActionListener(){ 
			//добавляем слушателя события для кнопки 
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
    	    public void actionPerformed(ActionEvent e)  
    	    /* 	ActionListener" имеет метод "actionPerformed" объекта "ActionEvent", 
	      	который реализуется путем простого вызова обработчика событий ActionPerformed.
	      	Ключевое слово public означает, что метод actionPerformed() доступен для любого другого класса Java
	      	Ключевое слово void означает, что метод main() не возвращает данных в программу, которая его вызвала. 
	      	*/   
    	    {   
    	    	if ((CB_how_1==0)&&(CB_how_2==0)){ //Если не выбран ни один флажок, выйдет ошибка что нужно выбрать один из способов
	    			JDialog D=new JDialog();
	    			JOptionPane.showMessageDialog(D, "Вы должны выбрать один из способов расчета", "Ошибка", JOptionPane.WARNING_MESSAGE);	
    	    	} else { //Если какой то из флажков выбран, то узнаем какой именно
    	    		    	    		
    	    		if (CB_how_1==1){ //выбран первый способ? Если да, то проверяем правильность введеных данных
    	    			if ((Index.isValidInput(TextField_probeg_do, "зафиксированный пробег"))&&
    	    					(Index.isValidInput(TextField_probeg_next, "последний пробег"))&&
    	    					(Index.isValidInput(TextField_volume, "объем бака"))){
    	    	    		/*Проверка правильности введенных данных. Функция isValidInput расположена в файле Index */

    	    				if (Double.parseDouble(TextField_probeg_do.getText())>Double.parseDouble(TextField_probeg_next.getText())){ 
    	    					/* Если зафиксированный пробег больше чем последний пробег то выводим ошибку */
    			            	JDialog D=new JDialog();
    		                	JOptionPane.showMessageDialog(D, "Введите правильные данные!", "Ошибка", JOptionPane.WARNING_MESSAGE);
    		                	/* showMessageDialog Отображает модальный диалог с одной кнопкой, которая помечена текстом
    		                	 *  "Oшибка" (или его локальным эквивалентом). Когда модальный диалог становится видимым,
    		                	 *   он блокирует пользовательский ввод в другие окна программы. "Введите правильные 
    		                	 *   данные!"  это сообщение отображаемое в диалоге  
    		                	*/
    		                	TextField_probeg_do.requestFocus();//ставит фокус на строчке 
    		                	TextField_probeg_do.setText(""); 
    		                	TextField_probeg_next.setText("");
    		                	/* setText означает написать текст в текстовое поле. Между кавычками ничего нет, значит 
    		                	 * текстовое поле будет пустым
    					    	*/  
    		                	
    			            } else {
    	    				    	    				
    	    					if (Distance.CB_100km==1){ /* Если пользователь изначально вводил данные в первую вкладку 
    	    						и нажал на флажок Рассчитать автоматически, то выполнится 2 функции. Первая записывает
    	    						данные которые ввел пользователь на первой вкладке, Вторая - на второй вкладке. Данные 
    	    						функции расположены в файле Calc*/
    	    	    	        	Calc.Dan_dist();
    	    						Calc.Dan_dist_100km();
    	    						Calc_distance.main(null); //Открывается окно с расчетами Calc_distance 
    	    	    				Index.Index.setVisible(false); //Данное окно становится невидимым
    	    	    	    	} else {/* Если пользователь изначально вводил данные только во вторую вкладку, то выполнится 
    	    	    	    		Функция, которая записывает данные которые ввел пользователь. Функция расположена в 
    	    	    	    		файле Calc*/
    	    	    	    		Calc.Dan_dist_100km();
    	    	    				Calc_distance100km.main(null); //Открывается окно с расчетами Calc_distance100km 
    	    	    				Index.Index.setVisible(false); //Данное окно становится невидимым
    	    	    			
    	    	    	    	}
    			            }
    	    			}
    	    		} else { //Был выбран второй способ? 
    	    			if ((Index.isValidInput(TextField_fuel, "количество израсходованного топлива"))&&
    					(Index.isValidInput(TextField_pass_dist, "пройденное расстояние"))){
    	    	    		/*Проверка правильности введенных данных. Функция isValidInput расположена в файле Index */

	    					if (Distance.CB_100km==1){/* Если пользователь изначально вводил данные в первую вкладку 
	    						и нажал на флажок Рассчитать автоматически, то выполнится 2 функции. Первая записывает
	    						данные которые ввел пользователь на первой вкладке, Вторая - на второй вкладке. Данные 
	    						функции расположены в файле Calc*/
	    						Calc.Dan_dist();
	    						Calc.Dan_dist_100km();
	    						Calc_distance.main(null); //Открывается окно с расчетами Calc_distance 
	    	    				Index.Index.setVisible(false); //Данное окно становится невидимым
	    	    	    	} else { /* Если пользователь изначально вводил данные только во вторую вкладку, то выполнится 
	    	    	    		Функция, которая записывает данные которые ввел пользователь. Функция расположена в 
	    	    	    		файле Calc*/
	    	    	    		Calc.Dan_dist_100km(); 
	    	    				Calc_distance100km.main(null); //Открывается окно с расчетами Calc_distance100km 
	    	    				Index.Index.setVisible(false); //Данное окно становится невидимым
	    	    			
	    	    	    	}
    	    			}
    	    		}
		            
		         }
    	    	
    	    	
    	    	
    	    }                                                        
    	   });  	
    	
    	
		
	}
	
}
