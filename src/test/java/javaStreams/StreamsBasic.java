package javaStreams;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StreamsBasic {
	
	
	// this is normal way to solve the problem
	@Test (enabled = false)
	public void numberOfNamesStartingWithA() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("anjali");
		names.add("sarvesh");
		names.add("akshata");
		names.add("ayush");
		names.add("pritesh");
		names.add("ishwar");
		names.add("Anil");
		
		int count=0;
		
		for(int i=0;i<names.size();i++) {
			String actualName=names.get(i);
			if(actualName.toLowerCase().startsWith("a")) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	// this is optimized way to solve the same problem with help of java streams
	
	@Test  // count(), filter()
	public void namesStartingWithA() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("anjali");
		names.add("sarvesh");
		names.add("akshata");
		names.add("ayush");
		names.add("pritesh");
		names.add("ishwar");
		names.add("Anil");
		
		
		// firstly we have to assign the array list to streams (Streams is nothing but a collection of string)
		// filter method will filter based upon the condition
		// filter method takes the lambda operation as a argument
		
		
		// lambda operation is divided into two parts, 
		// left side gives the parameter and right side gives action which we going to perform on the parameter
		// here "s" acts same as  actualnames in the above test
		// so when we give parameter, it gets all the values from the collection and then with other methods we can get the output that we want
		long count =names.stream().filter(s->s.toLowerCase().startsWith("a")).count();  // count is a terminal operator
		
		// create a stream
		// perform intermediate operation on the initial stream to transform it into another stream 
		// filter is intermediate operation here
		// like we have used filter method and labda operation to transform it into another stream
		// startWith("a") this is another stream that i am referring to
		// perform terminal operation on final stream to get the result (StartWithA() is the final stream)
		// so we have performed the count method on the final stream
		
		
		// There is no life intermediate operation if there is no terminal operation
		// terminal operation will execute only on the intermediate operation(in our case -Filter) returns true
		
		System.out.println(count);
		
		
		
		// We can directly create a stream  instead of creating a collection and then converting it
		
	Long total= Stream.of("anjali", "Sarvesh", "akshata", "ayush","ptitesh","ishwar","Anil").filter(k->k.toUpperCase().startsWith("A")).count();
		System.out.println(total);
		
	}
	
	@Test  // limit(), foreach()
	public void printWithSpecificLength() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("anjali");
		names.add("sarvesh");
		names.add("akshata");
		names.add("ayush");
		names.add("pritesh");
		names.add("ishwar");
		names.add("Anil");
		
	
		
		// with main stream, we have created one more sub stream with filter as length()>4
		// forEach will extract each and every string of the new stream i.e a->length>4
		// for each accept lambda operation
		// so all its extracted string will fall in the parameter as a
		// and then we will print it directly
		names.stream().filter(a-> a.length()>4).forEach(a->System.out.println(a));
		
		System.out.println();
		
		// if i want to limit the prints from the result then we can use limit method (terminal operetor)
		// limit method accepts int value
		// how many number of results we want, we have to pass that number into the method
		
		names.stream().filter(s-> s.length()>4).limit(2).forEach(s-> System.out.println(s));
		
		System.out.println();
		
		
		// if want to print everything from the array we can do the below way
		
		names.stream().forEach(i-> System.out.println(i));
		
		
	}
	
	@Test    // StartsWith() and endsWith(),  forEach()
	public void streamMap() {
		
		// print the names which ends with "h" in upper case
		
		Stream.of("anjali", "Sarvesh", "akshata", "ayush","ptitesh","ishwar","Anil")
		.filter(s->s.endsWith("h"))
		.map(s->s.toUpperCase()).forEach(s-> System.out.println(s));
		
		// so here, we have created substream as endsWith(), so all the filtered names got into the s parameter of filter method
		// using map method, we have converted the result in uppercase
		// Map method is used to modify the stream filter results
		// then by using foreach method we have printed the modified result
		
		System.out.println();
		
		
		// print the names start with "a" in sorted order
		Stream.of("anjali", "Sarvesh", "akshata", "ayush","ptitesh","ishwar","anil").
		filter(i->i.startsWith("A")|| i.startsWith("a")).
		sorted().forEach(i->System.out.println(i));
		
	}
	
	@Test  // concat()
	public void mergeTwoList() {
		
		
		//merge two array list and print them in sorted order
		ArrayList<String> names = new ArrayList<String>();
		names.add("anjali");
		names.add("sarvesh");
		names.add("akshata");
		names.add("ayush");
		
		
		ArrayList<String> names1 = new ArrayList<String>();
		names1.add("karan");
		names1.add("sarveshwari");
		names1.add("akash");
		names1.add("utika");
		
		// here we have used concat method to merge two lists
		// concat method accepts two arguments, name of 1st list as stream() and name of 2nd list as stream
	Stream<String> mergedLists=	Stream.concat(names.stream(), names1.stream());
	
	mergedLists.sorted().forEach(a->System.out.println(a));
		
		
	}
	
	@Test   // anyMatch()
	public void matchFromString() {
		
		// check whether required name is there in arrayList or not
		ArrayList<String> names = new ArrayList<String>();
		names.add("anjali");
		names.add("sarvesh");
		names.add("akshata");
		names.add("ayush");
		
		// Any matchMethod() is used to match required data from the arrayList
		// it returns boolean value
		
	boolean b=	names.stream().anyMatch(i->i.equalsIgnoreCase("Sarvesh"));
	System.out.println(b);
	
	Assert.assertTrue(b);
		
	}
	
	
	@Test // collect()
	public void convertingStreamBackToList() {
		
		// convert list into stream
		// do required manipulation
		// convert the final result back to the list
		// so we can use the processed list again for further use
		
	List<String> convertedList =	Stream.of("anjali", "Sarvesh", "akshata", "ayush","ptitesh","ishwar","Anil")
		.filter(s->s.endsWith("h"))
		.map(s->s.toUpperCase()).collect(Collectors.toList());
	
	// above what we have done is, firstly we have a Stream, we have filtered it with ends with h
	// then we have modifies the filtered output using map
	// then by using the collect method, we have converted the filtered stream o/p into list
	
	
	//printing the 1st item from the converted list
	System.out.println(convertedList.get(0));
		
		
		
	}
	
	@Test  // distinct()
	public void printUniqueNumbers() {
		
		
		int[] numbers= {1,8,7,7,3,3,1,7};
		
		// here we have converted the array to list
		// have used distinct() method to get the unique numbers
		// then arranged them into the sorted order
		
	Arrays.stream(numbers).distinct().sorted()
	.forEach(s->System.out.println(s));
	
	
	System.out.println();
	
	
	// here we have converted the array int to a list of integer
	// then we have printed the 3rd index
	
	int[] numbers1= {1,8,7,7,3,3,1,7};
	
	 List<Integer> values = Arrays.stream(numbers1)
             .boxed()  // if you need Integer
             .collect(Collectors.toList());
	 
	System.out.println(values.get(3));
	
	}

}
