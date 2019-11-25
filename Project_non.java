import java.io.*;
import java.lang.*;
import java.util.regex.*;
class Project_non {
  public static void main(String args[]) throws IOException {
    String waitopt;
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));    
    String buf; 
    waitopt  = "Wait your choice [menu, bye, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17] : ";
    displaymenu();
    System.out.print(waitopt);
    buf = stdin.readLine();
    while (!buf.equals("0")) {
      if (buf.equals("0") || buf.equals("bye")) {
        System.out.println("Bye Bye");  
        break;
      } 

      else if (buf.equals("1")) 
      {
        student();
        buf = " ";
      } 
      		else if (buf.equals("2")) 
      		{
        	subjects();
        	buf = " ";
      		} 
      			else if (buf.equals("3")) 
      			{
        		register();
        		buf = " ";
      			} 

      else if (buf.equals("4") || buf.equals("l1")) 
      {
        list("updtxt1.dat");
        buf = " ";
      } 
      		else if (buf.equals("5") || buf.equals("l2")) 
      		{
       		list("updtxt2.dat");
       		buf = " ";
      		}
      			else if (buf.equals("6") || buf.equals("l3"))
      			{
        		list("updtxt3.dat");
       			buf = " ";
      			}

      else if (buf.equals("7") || buf.equals("est")) 
      {
        editstudent();
        buf = " ";
      } 
      		else if (buf.equals("8") || buf.equals("esu")) 
      		{
       			editsubjects();
       			buf = " ";
     		} 
     				else if (buf.equals("9") || buf.equals("ere")) 
     				{
       				 editregister();
       				 buf = " ";
     				} 

      else if (buf.equals("10") || buf.equals("dst")) 
      {
        deletestudent();
        buf = " ";
      } 
      		 else if (buf.equals("11") || buf.equals("dsu")) 
     		 {
      		  deletesubjects();
       		  buf = " ";
     		 } 
     		 		 else if (buf.equals("12") || buf.equals("dre")) 
     				 {
       					 deleteregister();
       					 buf = " ";
      				 } 

      else if (buf.equals("13") || buf.equals("ast")) 
      {
        addnewstudent();
        buf = " ";
      } 
		       else if (buf.equals("14") || buf.equals("asu")) 
		      {
		        addnewsubjects();
		        buf = " ";
		      } 
				       else if (buf.equals("15") || buf.equals("are")) 
				      {
				        addnewregister();
				        buf = " ";
				      } 
	else if (buf.equals("16") || buf.equals("t")) 
      {
		transcript();
        buf = " ";
      }

      else if (buf.equals("17") || buf.equals("my")) 
      {
        myprofile();
        buf = " ";
      }

       else if (buf.equals("menu") || buf.equals("m")) 
       {
        displaymenu();
        buf = " ";
      } else {
        System.out.print(waitopt);
        buf = stdin.readLine();
        // buf = (char)System.in.read(); // for 1 character
      }
    }
  }
// ======================================================
  static void displaymenu () {
    System.out.println("0 : bye bye");
    System.out.println("1 : Create 3 fields, 3 records for updtxt1.dat");
    System.out.println("2 : Create 3 fields, 3 records for updtxt2.dat");
    System.out.println("3 : Create 4 fields, 4 records for updtxt3.dat");
    System.out.println("4 : List all records to Student");
    System.out.println("5 : List all records to Subjects");
    System.out.println("6 : List all records to Register");
    System.out.println("7 : Edit data Student");
    System.out.println("8 : Edit data Subjects");
    System.out.println("9 : Edit data Register");
    System.out.println("10 : Delete on ID Student");
    System.out.println("11 : Delete on ID Subjects");
    System.out.println("12 : Delete on ID Register");
    System.out.println("13 : Add new Student");
    System.out.println("14 : Add new Subjects");
    System.out.println("15 : Add new Register");
    System.out.println("16 : Transcript");
    System.out.println("17 : Profile of the program developer.");
    System.out.println("");  
  }
// ======================================================
  public static void student () throws IOException {
    FileOutputStream fout = new FileOutputStream("updtxt1.dat");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    pout.println("6008111001,Ms.Kronwarin Putthawong,Female");
    pout.println("6008111004,Mr.Wachirasak saisungthanasak,Male");
    pout.println("6008111006,Mr.Nattapat Kummoon,Male");
    System.out.println("Create 3 records : completely");
    pout.close();
  }
// =======================
   public static void subjects () throws IOException {
    FileOutputStream fout = new FileOutputStream("updtxt2.dat");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    pout.println("311,Management information systems : MIS,3");
    pout.println("321,Human Computer Interation : HCI,3");
    pout.println("322,Database Systems,3");
    System.out.println("Create 3 records : completely");
    pout.close();
  }
// =======================
   public static void register () throws IOException {
    FileOutputStream fout = new FileOutputStream("updtxt3.dat");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    pout.println("101,311,A,1");
    pout.println("102,321,A,2");
    pout.println("103,322,A,1");
    System.out.println("Create 3 records : completely");
    pout.close();
  }
// =======================
// ======================================================
  public static void list (String f) throws IOException {
    int n = 0;
    byte b[] = new byte[128];
    FileInputStream fin = new FileInputStream(f);
    while ((n = fin.read(b)) != -1) {
      for(int i=0;i<n;i++) {
        System.out.print((char)b[i]);
      }
    }
    fin.close();
  }

// ======================================================
  public static void editstudent () throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String studentid,studentname,sex;
    System.out.print("Wait Student ID : ");
    studentid = stdin.readLine();
    System.out.print("Wait Name : ");
    studentname = stdin.readLine();
    System.out.print("Wait Sex : ");
    sex = stdin.readLine();
    String b;
    String ar[] = new String[100];
    FileReader fin = new FileReader("updtxt1.dat");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    //
    int tot = i;
    FileOutputStream fout = new FileOutputStream("updtxt1.dat");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < tot) {      
      if (studentid.equals(ar[i].substring(0,10))) {
        pout.println(studentid + "," + studentname + "," + sex);
        System.out.println("Edit : completely");
      } else {
        pout.println(ar[i]);
      }
      i = i + 1;    
    }
    pout.close();
  }
// ==========================
  public static void editsubjects () throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String subjectid,subjectname,credit;
    System.out.print("Wait Subjects ID : ");
    subjectid = stdin.readLine();
    System.out.print("Wait Subjects Name : ");
    subjectname = stdin.readLine();
    System.out.print("Wait Credit : ");
    credit = stdin.readLine();
    String b;
    String ar[] = new String[100];
    FileReader fin = new FileReader("updtxt2.dat");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    //
    int tot = i;
    FileOutputStream fout = new FileOutputStream("updtxt2.dat");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < tot) {      
      if (subjectid.equals(ar[i].substring(0,3))) {
        pout.println(subjectid + "," + subjectname + "," + credit);
        System.out.println("Edit : completely");
      } else {
        pout.println(ar[i]);
      }
      i = i + 1;
    }
    pout.close();
  }
// ==========================
  public static void editregister () throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String registerid,subjectid,grade,sec;
    System.out.print("Wait Register ID : ");
    registerid = stdin.readLine();
    System.out.print("Wait Registe Nrame : ");
    subjectid = stdin.readLine();
    System.out.print("Wait Grade : ");
    grade = stdin.readLine();
    System.out.print("Wait Sec : ");
    sec = stdin.readLine();
    String b;
    String ar[] = new String[100];
    FileReader fin = new FileReader("updtxt3.dat");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    //
    int tot = i;
    FileOutputStream fout = new FileOutputStream("updtxt3.dat");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < tot) {      
      if (registerid.equals(ar[i].substring(0,4))) {
        pout.println(registerid + "," + subjectid + "," + grade + "," + sec);
        System.out.println("Edit : completely");
      } else {
        pout.println(ar[i]);
      }
      i = i + 1;
    }
    pout.close();
  }
// ==========================
// ======================================================
  public static void deletestudent () throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String bufid;
    System.out.print("Wait Student ID : ");
    bufid = stdin.readLine();
    String b;
    String ar[] = new String[100];
    FileReader fin = new FileReader("updtxt1.dat");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    //
    int tot = i;
    FileOutputStream fout = new FileOutputStream("updtxt1.dat");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < tot) {      
      if (bufid.equals(ar[i].substring(0,10))) {
        System.out.println("Delete : completely");
      } else {
        pout.println(ar[i]);
      }
      i = i + 1;
    }
    pout.close();
  }
  // ==========================
   public static void deletesubjects () throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String bufid;
    System.out.print("Wait Subjects ID : ");
    bufid = stdin.readLine();
    String b;
    String ar[] = new String[100];
    FileReader fin = new FileReader("updtxt2.dat");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    //
    int tot = i;
    FileOutputStream fout = new FileOutputStream("updtxt2.dat");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < tot) {      
      if (bufid.equals(ar[i].substring(0,3))) {
        System.out.println("Delete : completely");
      } else {
        pout.println(ar[i]);
      }
      i = i + 1;
    }
    pout.close();
  }
// ===========================
   public static void deleteregister () throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String bufid;
    System.out.print("Wait Register ID : ");
    bufid = stdin.readLine();
    String b;
    String ar[] = new String[10];
    FileReader fin = new FileReader("updtxt3.dat");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    //
    int tot = i;
    FileOutputStream fout = new FileOutputStream("updtxt3.dat");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < tot) {      
      if (bufid.equals(ar[i].substring(0,3))) {
        System.out.println("Delete : completely");
      } else {
        pout.println(ar[i]);
      }
      i = i + 1;
    }
    pout.close();
  }
// ===========================
// ======================================================
  public static void addnewstudent () throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String studentid,studentname,sex;
    System.out.print("Wait Student ID : ");
    studentid = stdin.readLine();
    System.out.print("Wait Name : ");
    studentname = stdin.readLine();
    System.out.print("Wait Sex : ");
    sex = stdin.readLine();
    String b;
    String ar[] = new String[10];
    FileReader fin = new FileReader("updtxt1.dat");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    //
    int tot = i;
    FileOutputStream fout = new FileOutputStream("updtxt1.dat");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < tot) {      
      pout.println(ar[i]);     
      i = i + 1;
    }
    pout.println(studentid + "," + studentname + "," + sex);
    System.out.println("Add : completely");
    pout.close();
  }
  // ==========================
    public static void addnewsubjects () throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String subjectid,subjectname,credit;
	System.out.print("Wait Subjects ID : ");
    subjectid = stdin.readLine();
    System.out.print("Wait Subjects Name : ");
    subjectname = stdin.readLine();
    System.out.print("Wait Credit : ");
    credit = stdin.readLine();
    String b;
    String ar[] = new String[100];
    FileReader fin = new FileReader("updtxt2.dat");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    //
    int tot = i;
    FileOutputStream fout = new FileOutputStream("updtxt2.dat");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < tot) {      
      pout.println(ar[i]);     
      i = i + 1;
    }
    pout.println(subjectid + "," + subjectname + "," + credit);
    System.out.println("Add : completely");
    pout.close();
  }
// ==========================
    public static void addnewregister () throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	String registerid,subjectid,grade,sec;
    System.out.print("Wait Register ID : ");
    registerid = stdin.readLine();
    System.out.print("Wait Registe Name : ");
    subjectid = stdin.readLine();
    System.out.print("Wait Grade : ");
    grade = stdin.readLine();
    System.out.print("Wait Sec : ");
    sec = stdin.readLine();
    String b;
    String ar[] = new String[100];
    FileReader fin = new FileReader("updtxt3.dat");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((b =  bin.readLine()) != null) {      
      ar[i] = b; 
      i = i + 1;
    }    
    fin.close();
    //
    int tot = i;
    FileOutputStream fout = new FileOutputStream("updtxt3.dat");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < tot) {      
      pout.println(ar[i]);     
      i = i + 1;
    }
    pout.println(registerid + "," + subjectid + "," + grade + "," + sec);
    System.out.println("Add : completely");
    pout.close();
  }

// ======================================================
    public static void transcript () throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    int i = 0,t1,t2,t3;
    String b,subjectid,bufid,a;
    String[] fields;
    String[] recs1 = new String[100];
    String[] recs2 = new String[100];
    String[] recs3 = new String[100];

    System.out.print("Wait Student ID : ");
    bufid = stdin.readLine();
     String ar[] = new String[100];
    FileReader fin = new FileReader("updtxt1.dat");
    BufferedReader bin = new BufferedReader (fin);
    int i = 0;
    while ((a =  bin.readLine()) != null) {      
      ar[i] = a; 
      i = i + 1;
    }    
    fin.close();
    //
    int tot = i;
    FileOutputStream fout = new FileOutputStream("updtxt1.dat");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    PrintStream pout = new PrintStream(bout);
    i = 0;
    while (i < tot) {      
      if (bufid.equals(ar[i].substring(0,10))) 
      {
         FileReader fin = new FileReader("updtxt1.dat");
    BufferedReader bin = new BufferedReader (fin);
    while ((b =  bin.readLine()) != null) {
      recs1[i] = b;
      i = i + 1;
    }
    fin.close();
    t1 = i;
    i = 0;
    //
    FileReader fin2 = new FileReader("updtxt2.dat");
    BufferedReader bin2 = new BufferedReader (fin2);
    while ((b =  bin2.readLine()) != null) {
      recs2[i] = b;

      i = i + 1;
    }
    fin2.close();
    t2 = i;
    //
    FileReader fin3 = new FileReader("updtxt3.dat");
    BufferedReader bin3 = new BufferedReader (fin3);
    while ((b =  bin3.readLine()) != null) {
      recs3[i] = b;

      i = i + 1;
    }
    fin3.close();
    t3 = i;
    //
    for (int x=0; x<t1; x++) 
    {
    fields = recs1[x].split(",");
	      System.out.println("Student ID"+" : "+fields[0]);
	      System.out.println("Name : "+ fields[1] );
	    for(int j=0;j<t2;j++) 
	    {
	      fields = recs2[j].split(",");
	      System.out.println("Subjects" +" : "+ fields[1]);
	      subjectid = fields[0];
	      for(int k=0;k<t3;k++) 
	      {
	        fields = recs3[k].split(",");
	        if (fields[1].equals(subjectid)) 
	        {
	           System.out.println("Grade"+" : "+ fields[2]);
	        }
	      }
	    }
	    //System.out.println("Grade" +" : "+"A");
	}
      } else {
        pout.println(ar[i]);
      }
      i = i + 1;
    }
    pout.close();
  }
// ======================================================
  public static void myprofile () throws IOException 
  {
    System.out.println("Let me introduce myself. My name is Nattapat Kummoon");
    System.out.println("My nickname is Non");
    System.out.println("I am studying at Nation University");
    System.out.println("My major was Computer Science");
    System.out.println("My hobby is playing music.");
  }
}