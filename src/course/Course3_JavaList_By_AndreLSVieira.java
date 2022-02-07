package course;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class Course3_JavaList_By_AndreLSVieira {

	public static void main(String[] args) {

		System.out.println("STEPS OF THE CRIATION JAVA LIST ");

		System.out.println();

		System.out.println(
				"A interface Java List é um subtipo da interface Java Collection. Esta é a interface padrão que herda a interface Collection do Java.\n a interface da lista Java se estende da interface Collection do pacote java.util\n"
						+

						" que, por sua vez, se estende da interface Iterable do pacote java.util. A classe AbstractList fornece a implementação esquelética da interface Lista. \n"
						+

						" As classes LinkedList, Stack, Vector, ArrayList e CopyOnWriteArrayList são todas as classes de implementação da interface List que são frequentemente usadas por programadores.\n Assim, existem quatro tipos de listas em Java, ou seja, \n"
						+

						" Stack, LinkedList, ArrayList e Vector. " +

						" Portanto, quando você tem que implementar interface de lista, você pode implementar qualquer uma das classes de tipo de lista acima, dependendo dos requisitos.\n Para incluir a funcionalidade da interface de lista em seu programa, você \n"
						+

						" terá que importar o pacote java.util.* que contém interface de lista e outras definições  de classes da seguinte forma: \n"
						+

						" import java.util.*; \n" + " Criar e declarar lista \n"
						+ " Já afirmamos que list é uma interface e é implementado por classes como ArrayList, Stack, Vector e LinkedList.\n Portanto, você pode declarar e criar instâncias da lista de qualquer uma das seguintes maneiras: \n"
						+

						" List linkedlist = new LinkedList();\n" + " List arrayList = new ArrayList(); \n"
						+ " List vec_list = new Vector(); \n" + " List stck_list = new Stack(); \n"
						+ " Como mostrado acima, você pode criar uma lista com qualquer uma das classes acima e, em seguida, inicializar essas listas com valores.\n A partir das instruções acima, você pode descobrir que a ordem dos elementos mudará dependendo da \n"
						+

						" classe usada para criar uma instância da lista.\n" +

						" Por exemplo, para uma lista com classe stack, o pedido é Last In, First Out (LIFO).\n" +

						" Inicializar lista Java "
						+ " Você pode fazer uso de qualquer um dos métodos dados abaixo para inicializar um objeto de lista.\n"
						+

						" #1) Usando o método asList\n"
						+ " O método asList () já está abordado em detalhes no tópico Arrays. Você pode criar uma lista imutável usando os valores de matriz.\n"
						+

						" A sintaxe geral é:\n" +

						" List<data_type> listname = Arrays.asList(array_name);\n"
						+ " Aqui, o data_type deve coincidir com o da matriz.\n" +

						" A instrução acima cria uma lista imutável. Se você quiser que a lista seja mutável, então você terá que criar uma instância da lista usando novos\n e, em seguida, atribuir os elementos de matriz a ela usando o método asList.\n"
						+ " Isto é como mostrado abaixo:\n" +

						" List<data_type> listname = new ArrayList<> (Arrays.asList(array_name));");

		String[] strArray = { "<<java.util>>, Class Stack<E>", "<<java.util>>, Class Vector<E>",
				"<<java.util>>, Class ArrayList<E>", "<<java.util>>, Class AbstractList<E>",
				"<<java.util.concurrent>>,CopyOnWriteArrayList<E>", "<<java.util>>",

				"LinkedList<E>", "<<java.util>>, Interface List<E>", "<<java.util>>, Interface Collection<E>",
				"<<java.util>>, Interface Iterable<T>"
						+ "As shown in the above class diagram, the Java list interface extends from the Collection interface of \n"
						+

						" java.util package \n which in turn extends from the Iterable interface of the java.util package. The class AbstractList provides the skeletal implementation of the List interface.\n"
						+

						" The classes LinkedList, Stack, Vector, ArrayList, and CopyOnWriteArrayList are all the implementation classes of List interface that are frequently used by programmers.\n Thus there are four types of lists in Java i.e. Stack, LinkedList,\n"
						+

						" ArrayList, and Vector.\n" +

						" Hence, when you have to implement list Interface, you can implement any of the above list type class depending on the requirements.\n To include the functionality of the list interface in your program, you will have to import the package\n"
						+

						" java.util.* that contain list interface and other classes definitions as follows:\n" +

						" import java.util.*;\n" + " Create & Declare List\n"
						+ " We have already stated that List is an interface and is implemented by classes like ArrayList, Stack, Vector and LinkedList.\n Hence you can declare and create instances of the list in any one of the following ways:\n"
						+

						" List linkedlist = new LinkedList();\n" + " List arrayList = new ArrayList();\n"
						+ " List vec_list = new Vector();\n" + " List stck_list = new Stack();\n"
						+ " As shown above, you can create a list with any of the above classes and then initialize these lists with values.\n From the above statements, you can make out that the order of elements will change depending on the class used for creating\n"
						+

						" an instance of the list.\n" +

						" For Example, for a list with stack class, the order is Last In, First Out (LIFO).\n" +

						" Initialize Java List\n"
						+ " You can make use of any of the methods given below to initialize a list object.\n" +

						" #1) Using The asList Method\n"
						+ " The method asList () is already covered in detail in the Arrays topic. You can create an immutable list using the array values.\n"
						+

						" The general syntax is:\n" +

						" List<data_type> listname = Arrays.asList(array_name);\n"
						+ " Here, the data_type should match that of the array.\n" +

						" The above statement creates an immutable list. If you want the list to be mutable, then you have to create an instance of the list using new\n and then assign the array elements to it using the asList method.\n"
						+

						" This is as shown below:\n" +

						" List<data_type> listname = new ArrayList<> (Arrays.asList(array_name);" };

		// initialize an immutable list from array using asList method

		List<String> courseList = Arrays.asList(strArray);

		System.out.println("Immutable List");

		for (String lis : courseList) {
			System.out.println(lis + " ");
		}
		System.out.println("\n");

		// initialize a mutable list(arraylist) from array using asList method

		List<String> exempleArrayL = new ArrayList<>(Arrays.asList(strArray));

		System.out.println("Mutable List");

		// add one more element to list

		exempleArrayL.add("all possible list examples have already been entered \n");

		// print the arrayList

		for (String lis : exempleArrayL) {
			System.out.println(lis + " ");

		}
	}
}
