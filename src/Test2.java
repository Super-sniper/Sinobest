import java.io.File;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Test2 {
	public static void main(String[] args) throws ParseException {
		//				SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd");
		//				Date dd = new Date();
		//				Date date1 = ft.parse( (String)ft.format(dd ));
		//				System.out.println(new File("").separator);
		//Date date2 = ft.parse( "2017.08.09" );
		//			    long quot = date1.getTime() - date2.getTime();
		//			    quot = quot / 1000 / 60 / 60 / 24;
		//				System.out.println(quot);
		//
		//		String bookno = "0";
		//		String bookname="9";
		//		String author = "8";
		//		String publishment = "7";
		//		String stuno = "6";
		//		String stuname = "5";
		//		String borrowtime = "4";
		//		
		//		String sql4 = "insert into borrowedrecord (BookNO,BookName,Author,Publishment,StuNO,"
		//				+ "StuName,BorrowTime) "
		//				+ "values ("+Integer.parseInt(bookno)+",'"+bookname+",'"+author+"','"+publishment+"',"+Integer.parseInt(stuno)+",'"+
		//				stuname+"','"+borrowtime+"')";
		//		System.out.println(sql4);

		//		List<String> list = new ArrayList<>();
		//		if(list.isEmpty()){
		//			System.out.println("lll");
		//		}else{
		//			System.out.println("null");
		//		}
		//		byte i= 127;
		//		byte j = 3;
		//		byte f=(byte) (i+j);
		//i = ++i+i+++i+++i++;

		//		short s = 1;
		//		int _i;
		//		_i = 2;
		//		s+=1;
		//		System.out.println(_i);

		//

	


		//正则表达式对邮箱的验证
	/*	String email = "931851150.90@qq.com";
		String words[] = email.split(email);
		Pattern p = Pattern.compile("\\p{Alnum}+@\\w+\\.\\p{Alpha}{2,3}");
		Matcher matcher = p.matcher(email);
		if(matcher.find()&&words.length==0){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
*/

	/*	String password = "903490YYY";
		String password2 = "ifiof894895";

		if(password.matches("[a-zA-Z]+[0-9]+")){
			System.out.println("true");
		}else{
			System.out.println("false");
		}*/
		
	m(9);
	}
	
	 public static void m(int i) { 
		   if (i == 1) { 
		     System.out.println("1*1=1 "); 
		   } else { 
		     m(i - 1); 
		     for (int j = 1; j <= i; j++) { 
		       System.out.print(j + "*" + i + "=" + j * i + " "); 
		     } 
		     System.out.println(); 
		   } 
		 } 
}

