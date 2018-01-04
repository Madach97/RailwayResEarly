/**************************************
// Name: RAILWAY RESERVATION
// Description:YOU CAN BOOK AND CANCEL TRAINS
// By: MADUMITHA AND SUKIRTI
//
// Assumes:FIRSTLY DOWNLOAD JDK FILE AND BLUEJ TO USE THE APPLICATION
//
// Side Effects:NO ``
//

/* PROJECT ON:railway reservation
COMPILED BY : SUKIRTI
CLASS AND DIVISION:X
DESCRIPTION : To Book / Cancel ticket
 */import java.io.*;
public class railwayres
{
InputStreamReader read = new InputStreamReader(System.in);
BufferedReader in = new BufferedReader(read);
static int choice,age,pnr,d,no;
static String month, name, gender, org, opt, dest;
String m = "June";
public static void main(String args[])throws IOException
{
   railwayres rr = new railwayres();


  rr.heading ();

  }

private void heading() throws IOException
{

      railwayres rr = new railwayres();

     System.out.println("*********************************************************");
     System.out.println("************Welcome to online railway booking************");
     System.out.println("*********************************************************");
     System.out.println("Choose from the options below:");
     System.out.println("Enter 1 for Booking" +
                           " 2 for Cancelling" +
                           " 3 to exit" );
      System.out.println("Enter your choice");

     choice = Integer.parseInt(in.readLine());
     switch (choice)
  {
      case 1: rr.book();
      break;
      case 2: rr.cancel();
      break;
      case 3: System.out.println("thank you");
      break;
      default: System.out.println("Wrong choice");
      }



    }

    private void book()throws IOException
        {

	try
	{
        System.out.println("Enter the month of travel");
        month = in.readLine();
        System.out.println("Enter the date of travel");
        d = Integer.parseInt(in.readLine());
        System.out.println(" Choose the name of your starting point from the options below (make sure the first letter is in caps)" +
                            " 1.Chennai" +
                            " 2. Mumbai" +
                            " 3. New Delhi" +
                            " 4. Jaipur" +
                            " 5. Kolkata" +
                            " 6. Banglore" +
                            " 7. Hyderabad");
             System.out.println("Enter your choice");
            org = in.readLine();
            System.out.println("choose your destination from the options (make sure the first letter is in caps)" +
                                 " Chennai" +
                               " Mumbai" +
                               " Kolkata" +
                               " Bangalore"+
                                " New Delhi" +
                                " Jaipur" +
                                " Hyderabad");
             System.out.println("Enter your choice");
             dest = in.readLine();
             switch (dest)
               {
          case "Chennai":
           {
            if (org.equals ("Mumbai"))
            {
                System.out.println("train - Chennai Dadar Express" +
                                    "train no. - 1064" +
                                    "Departure - 20:30 at mumbai dadar central" +
                                    " Arrival time - 19:45 (day 2) at chennai egmore station" +
                                    " ");
                System.out.println("Book now?");
                opt = in.readLine();
                {
                    if ( opt.equals ( "y") || opt.equals ( "yes") )
                    {
                            System.out.println("Enter the number of members travelling");
                            no = Integer.parseInt(in.readLine());
                            System.out.println("Enter your name:");
                            name = in.readLine();
                            System.out.println("Enter your gender");
                            gender = in.readLine();
                            System.out.println("Enter your age");
                            age = Integer.parseInt(in.readLine());
             {


                 if (age<=5)
             {
                 System.out.println("Fare = Rs.0");
             }
               if (age>5 && age<60)
                {
                    System.out.println("Fare= Rs.150 for non a/c and Rs.250 for a/c");
                }
                if (age>=60)
                {
                   System.out.println ("Fare = Rs.100 for non a/c and Rs.200 for a/c");
                }
              System.out.println(" your pnr n. is 123456789");

                }

                if (opt.equals ( "n") || opt.equals  ("no") );
                {
                System.out.println (" thank you for using online railway booking");
            }

        }
    }
    }



             if ( org.equals ("Newdelhi")|| org.equals ("New Delhi"))
             {
               System.out.println("train - Tamilnadu Express" +
                                    "train no. - 2621" +
                                    "Departure time - 22:30 at New Delhi station" +
                                    "Arrival time - 7:15 (day 2) at chennai central station" +
                                    (""));
               System.out.println("book now?");
               opt = in.readLine();
               {
                    if ( opt.equals ( "y") || opt.equals ( "yes") )
                   {

                            System.out.println("Enter the number of members travelling");
                            no = Integer.parseInt(in.readLine());
                            System.out.println("Enter your name:");
                            name = in.readLine();
                            System.out.println("Enter your gender");
                            gender = in.readLine();
                            System.out.println("Enter your age");
                            age = Integer.parseInt(in.readLine());

             if (age<=5)
             {
                 System.out.println("Fare = Rs.0");
             }
               if (age>5 && age<60)
                {
                    System.out.println("Fare= Rs.150 for non a/c and Rs.250 for a/c");
                }
                if (age>=60)
                {
                   System.out.println ("Fare = Rs.100 for non a/c and Rs.200 for a/c");
                }
            }
             System.out.println(" your pnr n. is 123456789");

                if (opt.equals ( "n") || opt.equals  ("no") );
                {
                System.out.println (" thank you for using online railway booking");

        }
    }
}

          if ( org.equals ("Kolkata" ))
                  {
                      System.out.println("train - Coromandel Express" +
                                    "train no. - 2842" +
                                    "Departure time - 14:50 at Kolkata Howrah station" +
                                    " Arrival time - 17:15 (day 2) at chennai central station" +
                                    (""));
               System.out.println("book now?");
               opt = in.readLine();
               {
                    if ( opt.equals ( "y") || opt.equals ( "yes") )
                   {

                            System.out.println("Enter the number of members travelling");
                            no = Integer.parseInt(in.readLine());
                            System.out.println("Enter your name:");
                            name = in.readLine();
                            System.out.println("Enter your gender");
                            gender = in.readLine();
                            System.out.println("Enter your age");
                            age = Integer.parseInt(in.readLine());

             if (age<=5)
             {
                 System.out.println("Fare = Rs.0");
             }
               if (age>5 && age<60)
                {
                    System.out.println("Fare= Rs.150 for non a/c and Rs.250 for a/c");
                }
                if (age>=60)
                {
                   System.out.println ("Fare = Rs.100 for non a/c and Rs.200 for a/c");
                }
              System.out.println(" your pnr n. is 123456789");

                }
                if (opt.equals ( "n") || opt.equals  ("no") );
                {
                System.out.println (" thank you for using online railway booking") ;
            }

        }
    }
            if ( org.equals ("Jaipur"))
            {
              System.out.println("train - Jaipur Express" +
                                    "train no. - 9767" +
                                    "Departure time - 19:40 at Jaipur junction" +
                                    " Arrival time - 9:45 (day 2)Chennai central station" +
                                    (""));
                                     System.out.println("book now?");
               opt = in.readLine();
               {
                    if ( opt.equals ( "y") || opt.equals ( "yes") )
                   {

                            System.out.println("Enter the number of members travelling");
                            no = Integer.parseInt(in.readLine());
                            System.out.println("Enter your name:");
                            name = in.readLine();
                            System.out.println("Enter your gender");
                            gender = in.readLine();
                            System.out.println("Enter your age");
                            age = Integer.parseInt(in.readLine());

             if (age<=5)
             {
                 System.out.println("Fare = Rs.0");
             }
               if (age>5 && age<60)
                {
                    System.out.println("Fare= Rs.150 for non a/c and Rs.250 for a/c");
                }
                if (age>=60)
                {
                   System.out.println ("Fare = Rs.100 for non a/c and Rs.200 for a/c");
                }

                System.out.println(" your pnr n. is 123456789");
                }
                if (opt.equals ( "n") || opt.equals  ("no") );
                {
                System.out.println (" thank you for using online railway booking");
            }
                }
        }
        if ( org.equals ("Banglore"))
        {
              System.out.println("train - Brindavan Express" +
                                    "train no. - 2639" +
                                    "Departure time - 14:30 at banglore city junction" +
                                    " Arrival time - 20:25 at chennai central" +
                                    (""));
               System.out.println("book now?");
               opt = in.readLine();
               {
                    if ( opt.equals ( "y") || opt.equals ( "yes") )
                   {

                            System.out.println("Enter the number of members travelling");
                            no = Integer.parseInt(in.readLine());
                            System.out.println("Enter your name:");
                            name = in.readLine();
                            System.out.println("Enter your gender");
                            gender = in.readLine();
                            System.out.println("Enter your age");
                            age = Integer.parseInt(in.readLine());

             if (age<=5)
             {
                 System.out.println("Fare = Rs.0");
             }
               if (age>5 && age<60)
                {
                    System.out.println("Fare= Rs.150 for non a/c and Rs.250 for a/c");
                }
                if (age>=60)
                {
                   System.out.println ("Fare = Rs.100 for non a/c and Rs.200 for a/c");
                }
              System.out.println(" your pnr n. is 123456789");

                }
                if (opt == "n" || opt == "no");
                {
                System.out.println (" thank you for using online railway booking");
            }
                      }
        }
        if (org.equals ("Hyderabad" ))
        {
              System.out.println("train - Charminar Express" +
                                    "train no. - 2639" +
                                    "Departure time - 18:55 at secundrabad junction" +
                                    " Arrival time - 08:15 at chennai central" +
                                    (""));
               System.out.println("book now?");
               opt = in.readLine();
               {
                    if ( opt.equals ( "y") || opt.equals ( "yes") )
                   {

                            System.out.println("Enter the number of members travelling");
                            no = Integer.parseInt(in.readLine());
                            System.out.println("Enter your name:");
                            name = in.readLine();
                            System.out.println("Enter your gender");
                            gender = in.readLine();
                            System.out.println("Enter your age");
                            age = Integer.parseInt(in.readLine());


             if (age<=5)
             {
                 System.out.println("Fare = Rs.0");
             }
               if (age>5 && age<60)
                {
                    System.out.println("Fare= Rs.150 for non a/c and Rs.250 for a/c");
                }
                if (age>=60)
                {
                   System.out.println ("Fare = Rs.100 for non a/c and Rs.200 for a/c");
                }
              System.out.println(" your pnr n. is 123456789");

                }
                if (opt == "n" || opt == "no");
                {
                System.out.println (" thank you for using online railway booking");
            }
                      }
        }
    }


    break;
    case "Mumbai":
    {
            if (org.equals ("Chennai"))
            {
                System.out.println("train - Chennai Dadar Express" +
                                    "train no. - 1064" +
                                    "Departure - 20:30 at mumbai dadar central" +
                                    " Arrival time - 19:45 (day 2) at chennai egmore station" +
                                    " ");
                System.out.println("Book now?");
                opt = in.readLine();
                {
                    if ( opt == "y" || opt == "yes")
                    {
                            System.out.println("Enter the number of members travelling");
                            no = Integer.parseInt(in.readLine());
                            System.out.println("Enter your name:");
                            name = in.readLine();
                            System.out.println("Enter your gender");
                            gender = in.readLine();
                            System.out.println("Enter your age");
                            age = Integer.parseInt(in.readLine());

             {
                 if (age<=5)
             {
                 System.out.println("Fare = Rs.0");
             }
               if (age>5 && age<60)
                {
                    System.out.println("Fare= Rs.150 for non a/c and Rs.250 for a/c");
                }
                if (age>=60)
                {
                   System.out.println ("Fare = Rs.100 for non a/c and Rs.200 for a/c");
                }
              System.out.println(" your pnr n. is 123456789");

                }
                if (opt.equals ( "n") || opt.equals  ("no") );
                {
                System.out.println (" thank you for using online railway booking");
            }

        }
    }
    }

             if ( org.equals ("NewDelhi") || org.equals ("New Delhi") )
             {
               System.out.println("train - Rajdhani Express" +
                                    "train no. - 2621" +
                                    "Departure time - 16:30 at New Delhi station" +
                                    "Arrival time - 8:35 (day 2) at mumbai central station" +
                                    (""));
               System.out.println("book now?");
               opt = in.readLine();
               {
                    if ( opt.equals ( "y") || opt.equals ( "yes") )
                   {

                            System.out.println("Enter the number of members travelling");
                            no = Integer.parseInt(in.readLine());
                            System.out.println("Enter your name:");
                            name = in.readLine();
                            System.out.println("Enter your gender");
                            gender = in.readLine();
                            System.out.println("Enter your age");
                            age = Integer.parseInt(in.readLine());

             if (age<=5)
             {
                 System.out.println("Fare = Rs.0");
             }
               if (age>5 && age<60)
                {
                    System.out.println("Fare= Rs.150 for non a/c and Rs.250 for a/c");
                }
                if (age>=60)
                {
                   System.out.println ("Fare = Rs.100 for non a/c and Rs.200 for a/c");
                }
            }
             System.out.println(" your pnr n. is 123456789");
                if (opt.equals ( "n") || opt.equals  ("no") );
                {
                System.out.println (" thank you for using online railway booking");

        }
    }
}
          if ( org.equals ("Kolkata") )
                  {
                      System.out.println("train - Gitanjali Express" +
                                    "train no. - 2842" +
                                    "Departure time - 13:50 at Kolkata Howrah station" +
                                    " Arrival time - 21:20 (day 2) at mumbai central station" +
                                    (""));
               System.out.println("book now?");
               opt = in.readLine();
               {
                    if ( opt.equals ( "y") || opt.equals ( "yes") )
                   {

                            System.out.println("Enter the number of members travelling");
                            no = Integer.parseInt(in.readLine());
                            System.out.println("Enter your name:");
                            name = in.readLine();
                            System.out.println("Enter your gender");
                            gender = in.readLine();
                            System.out.println("Enter your age");
                            age = Integer.parseInt(in.readLine());

             if (age<=5)
             {
                 System.out.println("Fare = Rs.0");
             }
               if (age>5 && age<60)
                {
                    System.out.println("Fare= Rs.150 for non a/c and Rs.250 for a/c");
                }
                if (age>=60)
                {
                   System.out.println ("Fare = Rs.100 for non a/c and Rs.200 for a/c");
                }
              System.out.println(" your pnr n. is 123456789");

                }
                if (opt.equals ( "n") || opt.equals  ("no") );
                {
                System.out.println (" thank you for using online railway booking") ;
            }

        }
    }
            if ( org.equals ("Jaipur" ))
            {
              System.out.println("train - jaipur-mumbai SF Express" +
                                    "train no. - 9767" +
                                    "Departure time -14:10 at Jaipur junction" +
                                    " Arrival time - 07:50 (day 2)mumbai central station" +
                                    (""));
                                     System.out.println("book now?");
               opt = in.readLine();
               {
                    if ( opt.equals ( "y") || opt.equals ( "yes") )
                   {

                            System.out.println("Enter the number of members travelling");
                            no = Integer.parseInt(in.readLine());
                            System.out.println("Enter your name:");
                            name = in.readLine();
                            System.out.println("Enter your gender");
                            gender = in.readLine();
                            System.out.println("Enter your age");
                            age = Integer.parseInt(in.readLine());

             if (age<=5)
             {
                 System.out.println("Fare = Rs.0");
             }
               if (age>5 && age<60)
                {
                    System.out.println("Fare= Rs.150 for non a/c and Rs.250 for a/c");
                }
                if (age>=60)
                {
                   System.out.println ("Fare = Rs.100 for non a/c and Rs.200 for a/c");
                }

                System.out.println(" your pnr n. is 123456789");
                }
                if (opt.equals ( "n") || opt.equals  ("no") );
                {
                System.out.println (" thank you for using online railway booking");
            }
                }
        }
        if ( org.equals ("Banglore"))
        {
              System.out.println("train - udayan Express" +
                                    "train no. - 2639" +
                                    "Departure time - 08:50 at banglore city junction" +
                                    " Arrival time - 08:05 at chennai central" +
                                    (""));
               System.out.println("book now?");
               opt = in.readLine();
               {
                    if ( opt.equals ( "y") || opt.equals ( "yes") )
                   {

                            System.out.println("Enter the number of members travelling");
                            no = Integer.parseInt(in.readLine());
                            System.out.println("Enter your name:");
                            name = in.readLine();
                            System.out.println("Enter your gender");
                            gender = in.readLine();
                            System.out.println("Enter your age");
                            age = Integer.parseInt(in.readLine());

             if (age<=5)
             {
                 System.out.println("Fare = Rs.0");
             }
               if (age>5 && age<60)
                {
                    System.out.println("Fare= Rs.150 for non a/c and Rs.250 for a/c");
                }
                if (age>=60)
                {
                   System.out.println ("Fare = Rs.100 for non a/c and Rs.200 for a/c");
                }
              System.out.println(" your pnr n. is 123456789");

                }
                if (opt == "n" || opt == "no");
                {
                System.out.println (" thank you for using online railway booking");
            }
                      }
        }
         if ( org.equals ("Hyderabad"))
        {
              System.out.println("train - Mumbai CST - hyderabad Express" +
                                    "train no. - 2639" +
                                    "Departure time - 05:55 at hyderabad deccan nampally" +
                                    " Arrival time - 12:45 (day 2)at mumbai central" +
                                    (""));
               System.out.println("book now?");
               opt = in.readLine();
               {
                    if ( opt.equals ( "y") || opt.equals ( "yes") )
                   {

                            System.out.println("Enter the number of members travelling");
                            no = Integer.parseInt(in.readLine());
                            System.out.println("Enter your name:");
                            name = in.readLine();
                            System.out.println("Enter your gender");
                            gender = in.readLine();
                            System.out.println("Enter your age");
                            age = Integer.parseInt(in.readLine());

             if (age<=5)
             {
                 System.out.println("Fare = Rs.0");
             }
               if (age>5 && age<60)
                {
                    System.out.println("Fare= Rs.150 for non a/c and Rs.250 for a/c");
                }
                if (age>=60)
                {
                   System.out.println ("Fare = Rs.100 for non a/c and Rs.200 for a/c");
                }
              System.out.println(" your pnr n. is 123456789");

                }
            }
                if (opt == "n" || opt == "no");
                {
                System.out.println (" thank you for using online railway booking");
            }

        }
    }
    break;
   case "New Delhi" :
   {
               if (org.equals ("Mumbai" ))
            {
                System.out.println("train - Swaraj Express" +
                                    "train no. - 1064" +
                                    "Departure - 07:55 at mumbai dadar central" +
                                    " Arrival time - 04:30 (day 2) at chennai egmore station" +
                                    " ");
                System.out.println("Book now?");
                opt = in.readLine();
                {
                    if ( opt == "y" || opt == "yes")
                    {
                            System.out.println("Enter the number of members travelling");
                            no = Integer.parseInt(in.readLine());
                            System.out.println("Enter your name:");
                            name = in.readLine();
                            System.out.println("Enter your gender");
                            gender = in.readLine();
                            System.out.println("Enter your age");
                            age = Integer.parseInt(in.readLine());
             {

                 if (age<=5)
             {
                 System.out.println("Fare = Rs.0");
             }
               if (age>5 && age<60)
                {
                    System.out.println("Fare= Rs.150 for non a/c and Rs.250 for a/c");
                }
                if (age>=60)
                {
                   System.out.println ("Fare = Rs.100 for non a/c and Rs.200 for a/c");
                }

                System.out.println(" your pnr n. is 123456789");
                }
                if (opt.equals ( "n") || opt.equals  ("no") );
                {
                System.out.println (" thank you for using online railway booking");
            }

        }
    }
    }

             if ( org.equals ("Chennai" ))
             {
               System.out.println("train - Tamilnadu Express" +
                                    "train no. - 2621" +
                                    "Arrival time - 22:30 (day 2) at New Delhi station" +
                                    "Departure time - 7:15 at chennai central station" +
                                    (""));
               System.out.println("book now?");
               opt = in.readLine();
               {
                    if ( opt.equals ( "y") || opt.equals ( "yes") )
                   {

                            System.out.println("Enter the number of members travelling");
                            no = Integer.parseInt(in.readLine());
                            System.out.println("Enter your name:");
                            name = in.readLine();
                            System.out.println("Enter your gender");
                            gender = in.readLine();
                            System.out.println("Enter your age");
                            age = Integer.parseInt(in.readLine());

             if (age<=5)
             {
                 System.out.println("Fare = Rs.0");
             }
               if (age>5 && age<60)
                {
                    System.out.println("Fare= Rs.150 for non a/c and Rs.250 for a/c");
                }
                if (age>=60)
                {
                   System.out.println ("Fare = Rs.100 for non a/c and Rs.200 for a/c");
                }
            }
              System.out.println(" your pnr n. is 123456789");
                if (opt.equals ( "n") || opt.equals  ("no") );
                {
                System.out.println (" thank you for using online railway booking");

        }
    }
}
          if ( org.equals ("Kolkata" ))
                  {
                     System.out.println("train - poorva Express" +
                                    "train no. - 2842" +
                                    "Departure time - 08:20 at Kolkata Howrah station" +
                                    " Arrival time - 07:20 (day 2) at new delhi station" +
                                    (""));
               System.out.println("book now?");
               opt = in.readLine();
               {
                    if ( opt.equals ( "y") || opt.equals ( "yes") )
                   {

                            System.out.println("Enter the number of members travelling");
                            no = Integer.parseInt(in.readLine());
                            System.out.println("Enter your name:");
                            name = in.readLine();
                            System.out.println("Enter your gender");
                            gender = in.readLine();
                            System.out.println("Enter your age");
                            age = Integer.parseInt(in.readLine());

             if (age<=5)
             {
                 System.out.println("Fare = Rs.0");
             }
               if (age>5 && age<60)
                {
                    System.out.println("Fare= Rs.150 for non a/c and Rs.250 for a/c");
                }
                if (age>=60)
                {
                   System.out.println ("Fare = Rs.100 for non a/c and Rs.200 for a/c");
                }
              System.out.println(" your pnr n. is 123456789");

                }
                if (opt.equals ( "n") || opt.equals  ("no") );
                {
                System.out.println (" thank you for using online railway booking") ;
            }

        }
    }
            if ( org.equals ("Jaipur" ))
            {
              System.out.println("train - uttaranchal Express" +
                                    "train no. - 9767" +
                                    "Departure time -4:05 at Jaipur junction" +
                                    " Arrival time - 10:40 (day 2) New Delhi station" +
                                    (""));
                                     System.out.println("book now?");
               opt = in.readLine();
               {
                    if ( opt.equals ( "y") || opt.equals ( "yes") )
                   {

                            System.out.println("Enter the number of members travelling");
                            no = Integer.parseInt(in.readLine());
                            System.out.println("Enter your name:");
                            name = in.readLine();
                            System.out.println("Enter your gender");
                            gender = in.readLine();
                            System.out.println("Enter your age");
                            age = Integer.parseInt(in.readLine());

             if (age<=5)
             {
                 System.out.println("Fare = Rs.0");
             }
               if (age>5 && age<60)
                {
                    System.out.println("Fare= Rs.150 for non a/c and Rs.250 for a/c");
                }
                if (age>=60)
                {
                   System.out.println ("Fare = Rs.100 for non a/c and Rs.200 for a/c");
                }
              System.out.println(" your pnr n. is 123456789");

                }
                if (opt.equals ( "n") || opt.equals  ("no") );
                {
                System.out.println (" thank you for using online railway booking");
            }
                }
        }
        if ( org.equals ("Banglore"))
        {
              System.out.println("train - Brindavan Express" +
                                    "train no. - 2639" +
                                    "Departure time - 14:30 at banglore city junction" +
                                    " Arrival time - 20:25 at new delhi station" +
                                    (""));
               System.out.println("book now?");
               opt = in.readLine();
               {
                    if ( opt.equals ( "y") || opt.equals ( "yes") )
                   {

                            System.out.println("Enter the number of members travelling");
                            no = Integer.parseInt(in.readLine());
                            System.out.println("Enter your name:");
                            name = in.readLine();
                            System.out.println("Enter your gender");
                            gender = in.readLine();
                            System.out.println("Enter your age");
                            age = Integer.parseInt(in.readLine());

             if (age<=5)
             {
                 System.out.println("Fare = Rs.0");
             }
               if (age>5 && age<60)
                {
                    System.out.println("Fare= Rs.150 for non a/c and Rs.250 for a/c");
                }
                if (age>=60)
                {
                   System.out.println ("Fare = Rs.100 for non a/c and Rs.200 for a/c");
                }

                  System.out.println(" your pnr n. is 123456789");
                }
                if (opt == "n" || opt == "no");
                {
                System.out.println (" thank you for using online railway booking");
            }
                      }
        }

        if ( org.equals ("Hyderabad"))
        {
              System.out.println("train - Hyderabad Express" +
                                    "train no. - 2639" +
                                    "Departure time - 06:25 at Hyderabad deccan nampally" +
                                    " Arrival time - 09:05 at new delhi station" +
                                    (""));
               System.out.println("book now?");
               opt = in.readLine();
               {
                    if ( opt.equals ( "y") || opt.equals ( "yes") )
                   {

                            System.out.println("Enter the number of members travelling");
                            no = Integer.parseInt(in.readLine());
                            System.out.println("Enter your name:");
                            name = in.readLine();
                            System.out.println("Enter your gender");
                            gender = in.readLine();
                            System.out.println("Enter your age");
                            age = Integer.parseInt(in.readLine());

             if (age<=5)
             {
                 System.out.println("Fare = Rs.0");
             }
               if (age>5 && age<60)
                {
                    System.out.println("Fare= Rs.150 for non a/c and Rs.250 for a/c");
                }
                if (age>=60)
                {
                   System.out.println ("Fare = Rs.100 for non a/c and Rs.200 for a/c");
                }

                  System.out.println(" your pnr n. is 123456789");
                }
                if (opt == "n" || opt == "no");
                {
                System.out.println (" thank you for using online railway booking");
            }
                      }
        }
    }
        break;
      case "Jaipur":
       {
          if (org.equals ("Mumbai" ))
            {
                System.out.println("train - mumbai jaipur SF Express" +
                                    "train no. - 1064" +
                                    "Departure - 20:30 at mumbai central" +
                                    " Arrival time - 19:45 (day 2) at jaipur junction" +
                                    " ");
                System.out.println("Book now?");
                opt = in.readLine();
                {
                    if ( opt == "y" || opt == "yes")
                    {
                            System.out.println("Enter the number of members travelling");
                            no = Integer.parseInt(in.readLine());
                            System.out.println("Enter your name:");
                            name = in.readLine();
                            System.out.println("Enter your gender");
                            gender = in.readLine();
                            System.out.println("Enter your age");
                            age = Integer.parseInt(in.readLine());

             {
                 if (age<=5)
             {
                 System.out.println("Fare = Rs.0");
             }
               if (age>5 && age<60)
                {
                    System.out.println("Fare= Rs.150 for non a/c and Rs.250 for a/c");
                }
                if (age>=60)
                {
                   System.out.println ("Fare = Rs.100 for non a/c and Rs.200 for a/c");
                }
              System.out.println(" your pnr n. is 123456789");

                }
                if (opt.equals ( "n") || opt.equals  ("no") );
                {
                System.out.println (" thank you for using online railway booking");
            }

        }
    }
    }

             if ( org.equals ("NewDelhi" )|| org.equals ("New Delhi"))
             {
               System.out.println("train - Uttaranchal Express" +
                                    "train no. - 2621" +
                                    "Departure time - 04:05 at New Delhi station" +
                                    "Arrival time - 10:40 (day 2) at jaipur junction " +
                                    (""));
               System.out.println("book now?");
               opt = in.readLine();
               {
                    if ( opt.equals ( "y") || opt.equals ( "yes") )
                   {

                            System.out.println("Enter the number of members travelling");
                            no = Integer.parseInt(in.readLine());
                            System.out.println("Enter your name:");
                            name = in.readLine();
                            System.out.println("Enter your gender");
                            gender = in.readLine();
                            System.out.println("Enter your age");
                            age = Integer.parseInt(in.readLine());

             if (age<=5)
             {
                 System.out.println("Fare = Rs.0");
             }
               if (age>5 && age<60)
                {
                    System.out.println("Fare= Rs.150 for non a/c and Rs.250 for a/c");
                }
                if (age>=60)
                {
                   System.out.println ("Fare = Rs.100 for non a/c and Rs.200 for a/c");
                }
            }
               System.out.println(" your pnr n. is 123456789");
                if (opt.equals ( "n") || opt.equals  ("no") );
                {
                System.out.println (" thank you for using online railway booking");

        }
    }
}
          if ( org.equals ("Kolkata" ))
                  {
                      System.out.println("train - jodpur - howrah SF Express" +
                                    "train no. - 2842" +
                                    "Departure time - 04:00 at Kolkata Howrah station" +
                                    " Arrival time - 02:20 (day 2) at jaipur junction" +
                                    (""));
               System.out.println("book now?");
               opt = in.readLine();
               {
                    if ( opt.equals ( "y") || opt.equals ( "yes") )
                   {

                            System.out.println("Enter the number of members travelling");
                            no = Integer.parseInt(in.readLine());
                            System.out.println("Enter your name:");
                            name = in.readLine();
                            System.out.println("Enter your gender");
                            gender = in.readLine();
                            System.out.println("Enter your age");
                            age = Integer.parseInt(in.readLine());

             if (age<=5)
             {
                 System.out.println("Fare = Rs.0");
             }
               if (age>5 && age<60)
                {
                    System.out.println("Fare= Rs.150 for non a/c and Rs.250 for a/c");
                }
                if (age>=60)
                {
                   System.out.println ("Fare = Rs.100 for non a/c and Rs.200 for a/c");
                }
              System.out.println(" your pnr n. is 123456789");

                }
                if (opt.equals ( "n") || opt.equals  ("no") );
                {
                System.out.println (" thank you for using online railway booking") ;
            }

        }
    }
            if ( org.equals ("Chennai" ))
            {
              System.out.println("train - Jaipur Express" +
                                    "train no. - 9767" +
                                    "arrival time - 19:40 (day 2) at Jaipur junction" +
                                    " Departure time - 9:45 Chennai central station" +
                                    (""));
                                     System.out.println("book now?");
               opt = in.readLine();
               {
                    if ( opt.equals ( "y") || opt.equals ( "yes") )
                   {

                            System.out.println("Enter the number of members travelling");
                            no = Integer.parseInt(in.readLine());
                            System.out.println("Enter your name:");
                            name = in.readLine();
                            System.out.println("Enter your gender");
                            gender = in.readLine();
                            System.out.println("Enter your age");
                            age = Integer.parseInt(in.readLine());
             if (age<=5)
             {
                 System.out.println("Fare = Rs.0");
             }
               if (age>5 && age<60)
                {
                    System.out.println("Fare= Rs.150 for non a/c and Rs.250 for a/c");
                }
                if (age>=60)
                {
                   System.out.println ("Fare = Rs.100 for non a/c and Rs.200 for a/c");
                }
              System.out.println(" your pnr n. is 123456789");

                }
                if (opt.equals ( "n") || opt.equals  ("no") );
                {
                System.out.println (" thank you for using online railway booking");
            }
                }
        }
        if ( org.equals ("Banglore"))
        {
              System.out.println("train - Jaipur Express" +
                                    "train no. - 2639" +
                                    "Departure time - 01:05 at banglore city junction" +
                                    " Arrival time - 05:55 at jaipur junction" +
                                    (""));
               System.out.println("book now?");
               opt = in.readLine();
               {
                    if ( opt.equals ( "y") || opt.equals ( "yes") )
                   {

                            System.out.println("Enter the number of members travelling");
                            no = Integer.parseInt(in.readLine());
                            System.out.println("Enter your name:");
                            name = in.readLine();
                            System.out.println("Enter your gender");
                            gender = in.readLine();
                            System.out.println("Enter your age");
                            age = Integer.parseInt(in.readLine());
             if (age<=5)
             {
                 System.out.println("Fare = Rs.0");
             }
               if (age>5 && age<60)
                {
                    System.out.println("Fare= Rs.150 for non a/c and Rs.250 for a/c");
                }
                if (age>=60)
                {
                   System.out.println ("Fare = Rs.100 for non a/c and Rs.200 for a/c");
                }
              System.out.println(" your pnr n. is 123456789");

                }
                if (opt == "n" || opt == "no");
                {
                System.out.println (" thank you for using online railway booking");
            }
                      }
        }
         if ( org.equals ("Hyderabad"))
        {
              System.out.println("train - Secundrabad Jaipur Special" +
                                    "train no. - 2639" +
                                    "Departure time - 23:25 at secundrabad junction" +
                                    " Arrival time - 05:55 at jaipur junction" +
                                    (""));
               System.out.println("book now?");
               opt = in.readLine();
               {
                    if ( opt.equals ( "y") || opt.equals ( "yes") )
                   {

                            System.out.println("Enter the number of members travelling");
                            no = Integer.parseInt(in.readLine());
                            System.out.println("Enter your name:");
                            name = in.readLine();
                            System.out.println("Enter your gender");
                            gender = in.readLine();
                            System.out.println("Enter your age");
                            age = Integer.parseInt(in.readLine());
             if (age<=5)
             {
                 System.out.println("Fare = Rs.0");
             }
               if (age>5 && age<60)
                {
                    System.out.println("Fare= Rs.150 for non a/c and Rs.250 for a/c");
                }
                if (age>=60)
                {
                   System.out.println ("Fare = Rs.100 for non a/c and Rs.200 for a/c");
                }
              System.out.println(" your pnr n. is 123456789");

                }
                if (opt == "n" || opt == "no");
                {
                System.out.println (" thank you for using online railway booking");
            }
                      }
        }
    }
    break;
       case "Banglore" :
       {

            if (org.equals ("Mumbai" ))
            {
                System.out.println("train - Udayan Express" +
                                    "train no. - 1064" +
                                    "Departure - 08:05 at mumbai central" +
                                    " Arrival time - 08:50 (day 2) at banglore city junction" +
                                    " ");
                System.out.println("Book now?");
                opt = in.readLine();
                {
                    if ( opt == "y" || opt == "yes")
                    {
                            System.out.println("Enter the number of members travelling");
                            no = Integer.parseInt(in.readLine());
                            System.out.println("Enter your name:");
                            name = in.readLine();
                            System.out.println("Enter your gender");
                            gender = in.readLine();
                            System.out.println("Enter your age");
                            age = Integer.parseInt(in.readLine());
             {
                 if (age<=5)
             {
                 System.out.println("Fare = Rs.0");
             }
               if (age>5 && age<60)
                {
                    System.out.println("Fare= Rs.150 for non a/c and Rs.250 for a/c");
                }
                if (age>=60)
                {
                   System.out.println ("Fare = Rs.100 for non a/c and Rs.200 for a/c");
                }
              System.out.println(" your pnr n. is 123456789");

                }
                if (opt.equals ( "n") || opt.equals  ("no") );
                {
                System.out.println (" thank you for using online railway booking");
            }

        }
    }
    }

             if ( org.equals ("NewDelhi")|| org.equals ("New Delhi"))
             {
               System.out.println("train - karnataka express" +
                                    "train no. - 2621" +
                                    "Departure time - 21:15 at New Delhi station" +
                                    "Arrival time - 13:40 (day 2) at banglore city junction" +
                                    (""));
               System.out.println("book now?");
               opt = in.readLine();
               {
                    if ( opt.equals ( "y") || opt.equals ( "yes") )
                   {

                            System.out.println("Enter the number of members travelling");
                            no = Integer.parseInt(in.readLine());
                            System.out.println("Enter your name:");
                            name = in.readLine();
                            System.out.println("Enter your gender");
                            gender = in.readLine();
                            System.out.println("Enter your age");
                            age = Integer.parseInt(in.readLine());
             if (age<=5)
             {
                 System.out.println("Fare = Rs.0");
             }
               if (age>5 && age<60)
                {
                    System.out.println("Fare= Rs.150 for non a/c and Rs.250 for a/c");
                }
                if (age>=60)
                {
                   System.out.println ("Fare = Rs.100 for non a/c and Rs.200 for a/c");
                }
            }
               System.out.println(" your pnr n. is 123456789");
                if (opt.equals ( "n") || opt.equals  ("no") );
                {
                System.out.println (" thank you for using online railway booking");

        }
    }
}
          if ( org.equals ("Kolkata" ))
                  {
                      System.out.println("train - kolkata banglore Express" +
                                    "train no. - 2842" +
                                    "Departure time - 16:10 at Kolkata Howrah station" +
                                    " Arrival time - 04:10 (day 2) at banglore city junction" +
                                    (""));
               System.out.println("book now?");
               opt = in.readLine();
               {
                    if ( opt.equals ( "y") || opt.equals ( "yes") )
                   {

                            System.out.println("Enter the number of members travelling");
                            no = Integer.parseInt(in.readLine());
                            System.out.println("Enter your name:");
                            name = in.readLine();
                            System.out.println("Enter your gender");
                            gender = in.readLine();
                            System.out.println("Enter your age");
                            age = Integer.parseInt(in.readLine());
             if (age<=5)
             {
                 System.out.println("Fare = Rs.0");
             }
               if (age>5 && age<60)
                {
                    System.out.println("Fare= Rs.150 for non a/c and Rs.250 for a/c");
                }
                if (age>=60)
                {
                   System.out.println ("Fare = Rs.100 for non a/c and Rs.200 for a/c");
                }

                 System.out.println(" your pnr n. is 123456789");
                }
                if (opt.equals ( "n") || opt.equals  ("no") );
                {
                System.out.println (" thank you for using online railway booking") ;
            }

        }
    }
            if ( org.equals ("Jaipur" ))
            {
              System.out.println("train - Jaipur- Mysore SF Express" +
                                    "train no. - 9767" +
                                    "Departure time - 19:40 at Jaipur junction" +
                                    " Arrival time - 12:55 (day 2) banglore city junction " +
                                    (""));
                                     System.out.println("book now?");
               opt = in.readLine();
               {
                    if ( opt.equals ( "y") || opt.equals ( "yes") )
                   {

                            System.out.println("Enter the number of members travelling");
                            no = Integer.parseInt(in.readLine());
                            System.out.println("Enter your name:");
                            name = in.readLine();
                            System.out.println("Enter your gender");
                            gender = in.readLine();
                            System.out.println("Enter your age");
                            age = Integer.parseInt(in.readLine());
             if (age<=5)
             {
                 System.out.println("Fare = Rs.0");
             }
               if (age>5 && age<60)
                {
                    System.out.println("Fare= Rs.150 for non a/c and Rs.250 for a/c");
                }
                if (age>=60)
                {
                   System.out.println ("Fare = Rs.100 for non a/c and Rs.200 for a/c");
                }

                   System.out.println(" your pnr n. is 123456789");
                }
                if (opt.equals ( "n") || opt.equals  ("no") );
                {
                System.out.println (" thank you for using online railway booking");
            }
                }
        }
        if ( org.equals ("Chennai"))
        {
              System.out.println("train - Brindavan Express" +
                                    "train no. - 2639" +
                                    "Arrival time - 14:30 at banglore city junction" +
                                    "Departure time - 20:25 at chennai central" +
                                    (""));
               System.out.println("book now?");
               opt = in.readLine();
               {
                    if ( opt.equals ( "y") || opt.equals ( "yes") )
                   {

                            System.out.println("Enter the number of members travelling");
                            no = Integer.parseInt(in.readLine());
                            System.out.println("Enter your name:");
                            name = in.readLine();
                            System.out.println("Enter your gender");
                            gender = in.readLine();
                            System.out.println("Enter your age");
                            age = Integer.parseInt(in.readLine());
             if (age<=5)
             {
                 System.out.println("Fare = Rs.0");
             }
               if (age>5 && age<60)
                {
                    System.out.println("Fare= Rs.150 for non a/c and Rs.250 for a/c");
                }
                if (age>=60)
                {
                   System.out.println ("Fare = Rs.100 for non a/c and Rs.200 for a/c");
                }
              System.out.println(" your pnr n. is 123456789");

                }
                if (opt == "n" || opt == "no");
                {
                System.out.println (" thank you for using online railway booking");
            }
                      }
        }
         if ( org.equals ("Hyderabad"))
        {
              System.out.println("train - Kongu Express" +
                                    "train no. - 2639" +
                                    "Arrival time - 01:00 at banglore city junction" +
                                    "Departure time - 12:30 at Hyderabad kacheguda" +
                                    (""));
               System.out.println("book now?");
               opt = in.readLine();
               {
                    if ( opt.equals ( "y") || opt.equals ( "yes") )
                   {

                            System.out.println("Enter the number of members travelling");
                            no = Integer.parseInt(in.readLine());
                            System.out.println("Enter your name:");
                            name = in.readLine();
                            System.out.println("Enter your gender");
                            gender = in.readLine();
                            System.out.println("Enter your age");
                            age = Integer.parseInt(in.readLine());
             if (age<=5)
             {
                 System.out.println("Fare = Rs.0");
             }
               if (age>5 && age<60)
                {
                    System.out.println("Fare= Rs.150 for non a/c and Rs.250 for a/c");
                }
                if (age>=60)
                {
                   System.out.println ("Fare = Rs.100 for non a/c and Rs.200 for a/c");
                }
              System.out.println(" your pnr n. is 123456789");

                }
                if (opt == "n" || opt == "no");
                {
                System.out.println (" thank you for using online railway booking");
            }
                      }
        }
    }
    break;
        case "Kolkata":
        {

            if (org.equals ("Mumbai" ))
            {
                System.out.println("train - Gitanjali Express" +
                                    "train no. - 1064" +
                                    "Departure - 06:00 at mumbai central" +
                                    " Arrival time - 12:30 (day 2) at kolkata howrah junction" +
                                    " ");
                System.out.println("Book now?");
                opt = in.readLine();
                {
                    if ( opt == "y" || opt == "yes")
                    {
                            System.out.println("Enter the number of members travelling");
                            no = Integer.parseInt(in.readLine());
                            System.out.println("Enter your name:");
                            name = in.readLine();
                            System.out.println("Enter your gender");
                            gender = in.readLine();
                            System.out.println("Enter your age");
                            age = Integer.parseInt(in.readLine());
             {
                 if (age<=5)
             {
                 System.out.println("Fare = Rs.0");
             }
               if (age>5 && age<60)
                {
                    System.out.println("Fare= Rs.150 for non a/c and Rs.250 for a/c");
                }
                if (age>=60)
                {
                   System.out.println ("Fare = Rs.100 for non a/c and Rs.200 for a/c");
                }
              System.out.println(" your pnr n. is 123456789");

                }
                if (opt.equals ( "n") || opt.equals  ("no") );
                {
                System.out.println (" thank you for using online railway booking");
            }

        }
    }
    }

             if ( org.equals ("NewDelhi")|| org.equals ("New Delhi"))
             {
               System.out.println("train - poorva Express" +
                                    "train no. - 2621" +
                                    "Departure time - 16:20 at New Delhi station" +
                                    "Arrival time - 16:45 (day 2) at kolkata howrah junction" +
                                    (""));
               System.out.println("book now?");
               opt = in.readLine();
               {
                    if ( opt.equals ( "y") || opt.equals ( "yes") )
                   {

                            System.out.println("Enter the number of members travelling");
                            no = Integer.parseInt(in.readLine());
                            System.out.println("Enter your name:");
                            name = in.readLine();
                            System.out.println("Enter your gender");
                            gender = in.readLine();
                            System.out.println("Enter your age");
                            age = Integer.parseInt(in.readLine());
             if (age<=5)
             {
                 System.out.println("Fare = Rs.0");
             }
               if (age>5 && age<60)
                {
                    System.out.println("Fare= Rs.150 for non a/c and Rs.250 for a/c");
                }
                if (age>=60)
                {
                   System.out.println ("Fare = Rs.100 for non a/c and Rs.200 for a/c");
                }
            }
                 System.out.println(" your pnr n. is 123456789");
                if (opt.equals ( "n") || opt.equals  ("no") );
                {
                System.out.println (" thank you for using online railway booking");

        }
    }
}
          if ( org.equals ("Chennai" ))
                  {
                      System.out.println("train - Coromandel Express" +
                                    "train no. - 2842" +
                                    "Arrival time - 14:50 at Kolkata Howrah station" +
                                    " Departure time - 17:15 (day 2) at chennai central station" +
                                    (""));
               System.out.println("book now?");
               opt = in.readLine();
               {
                    if ( opt.equals ( "y") || opt.equals ( "yes") )
                   {

                            System.out.println("Enter the number of members travelling");
                            no = Integer.parseInt(in.readLine());
                            System.out.println("Enter your name:");
                            name = in.readLine();
                            System.out.println("Enter your gender");
                            gender = in.readLine();
                            System.out.println("Enter your age");
                            age = Integer.parseInt(in.readLine());
             if (age<=5)
             {
                 System.out.println("Fare = Rs.0");
             }
               if (age>5 && age<60)
                {
                    System.out.println("Fare= Rs.150 for non a/c and Rs.250 for a/c");
                }
                if (age>=60)
                {
                   System.out.println ("Fare = Rs.100 for non a/c and Rs.200 for a/c");
                }
              System.out.println(" your pnr n. is 123456789");

                }
                if (opt.equals ( "n") || opt.equals  ("no") );
                {
                System.out.println (" thank you for using online railway booking") ;
            }

        }
    }
            if ( org.equals ("Jaipur" ))
            {
              System.out.println("train - Jodhpur- howrah Express" +
                                    "train no. - 9767" +
                                    "Departure time - 2:20 at Jaipur junction" +
                                    " Arrival time - 04:00 (day 2)kolkata howrah junction" +
                                    (""));
                                     System.out.println("book now?");
               opt = in.readLine();
               {
                    if ( opt.equals ( "y") || opt.equals ( "yes") )
                   {

                            System.out.println("Enter the number of members travelling");
                            no = Integer.parseInt(in.readLine());
                            System.out.println("Enter your name:");
                            name = in.readLine();
                            System.out.println("Enter your gender");
                            gender = in.readLine();
                            System.out.println("Enter your age");
                            age = Integer.parseInt(in.readLine());
             if (age<=5)
             {
                 System.out.println("Fare = Rs.0");
             }
               if (age>5 && age<60)
                {
                    System.out.println("Fare= Rs.150 for non a/c and Rs.250 for a/c");
                }
                if (age>=60)
                {
                   System.out.println ("Fare = Rs.100 for non a/c and Rs.200 for a/c");
                }
              System.out.println(" your pnr n. is 123456789");

                }
                if (opt.equals ( "n") || opt.equals  ("no") );
                {
                System.out.println (" thank you for using online railway booking");
            }
                }
        }
        if ( org.equals ("Banglore"))
        {
              System.out.println("train - Baghalpur Express" +
                                    "train no. - 2639" +
                                    "Departure time - 01:30 at yeshvanthpur unction" +
                                    " Arrival time - 22:25 (day 2) at kolkata howrah junction" +
                                    (""));
               System.out.println("book now?");
               opt = in.readLine();
               {
                    if ( opt.equals ( "y") || opt.equals ( "yes") )
                   {

                            System.out.println("Enter the number of members travelling");
                            no = Integer.parseInt(in.readLine());
                            System.out.println("Enter your name:");
                            name = in.readLine();
                            System.out.println("Enter your gender");
                            gender = in.readLine();
                            System.out.println("Enter your age");
                            age = Integer.parseInt(in.readLine());
             if (age<=5)
             {
                 System.out.println("Fare = Rs.0");
             }
               if (age>5 && age<60)
                {
                    System.out.println("Fare= Rs.150 for non a/c and Rs.250 for a/c");
                }
                if (age>=60)
                {
                   System.out.println ("Fare = Rs.100 for non a/c and Rs.200 for a/c");
                }
              System.out.println(" your pnr n. is 123456789");

                }
                if (opt == "n" || opt == "no");
                {
                System.out.println (" thank you for using online railway booking");
            }
                      }
        }
        if ( org.equals ("Hyderabad"))
        {
              System.out.println("train - East coast Express" +
                                    "train no. - 2639" +
                                    "Departure time - 10:00 at Hyderabad Deccan Nampally" +
                                    " Arrival time - 15:55 at kolkata howrah junction" +
                                    (""));
               System.out.println("book now?");
               opt = in.readLine();
               {
                    if ( opt.equals ( "y") || opt.equals ( "yes") )
                   {

                            System.out.println("Enter the number of members travelling");
                            no = Integer.parseInt(in.readLine());
                            System.out.println("Enter your name:");
                            name = in.readLine();
                            System.out.println("Enter your gender");
                            gender = in.readLine();
                            System.out.println("Enter your age");
                            age = Integer.parseInt(in.readLine());
             if (age<=5)
             {
                 System.out.println("Fare = Rs.0");
             }
               if (age>5 && age<60)
                {
                    System.out.println("Fare= Rs.150 for non a/c and Rs.250 for a/c");
                }
                if (age>=60)
                {
                   System.out.println ("Fare = Rs.100 for non a/c and Rs.200 for a/c");
                }
              System.out.println(" your pnr n. is 123456789");

                }
                if (opt == "n" || opt == "no");
                {
                System.out.println (" thank you for using online railway booking");
            }
                      }
        }
    }
    break;
    case "Hyderabad" :
    {

            if (org.equals ("Chennai" ))
            {
                System.out.println("train - Chennai Dadar Express" +
                                    "train no. - 1064" +
                                    "Departure - 08:155 at chennai central" +
                                    " Arrival time - 18:55 (day 2) at secundrabad station" +
                                    " ");
                System.out.println("Book now?");
                opt = in.readLine();
                {
                    if ( opt == "y" || opt == "yes")
                    {
                            System.out.println("Enter the number of members travelling");
                            no = Integer.parseInt(in.readLine());
                            System.out.println("Enter your name:");
                            name = in.readLine();
                            System.out.println("Enter your gender");
                            gender = in.readLine();
                            System.out.println("Enter your age");
                            age = Integer.parseInt(in.readLine());
             {
                 if (age<=5)
             {
                 System.out.println("Fare = Rs.0");
             }
               if (age>5 && age<60)
                {
                    System.out.println("Fare= Rs.150 for non a/c and Rs.250 for a/c");
                }
                if (age>=60)
                {
                   System.out.println ("Fare = Rs.100 for non a/c and Rs.200 for a/c");
                }
              System.out.println(" your pnr n. is 123456789");

                }
                if (opt.equals ( "n") || opt.equals  ("no") );
                {
                System.out.println (" thank you for using online railway booking");
            }

        }
    }
    }

             if ( org.equals ("NewDelhi")|| org.equals ("New Delhi"))
             {
               System.out.println("train - Andhra pradesh Express" +
                                    "train no. - 2621" +
                                    "Departure time - 08:40 at New Delhi station" +
                                    "Arrival time - 12:20 (day 2) at  hyderabad kacheguda station" +
                                    (""));
               System.out.println("book now?");
               opt = in.readLine();
               {
                    if ( opt.equals ( "y") || opt.equals ( "yes") )
                   {

                            System.out.println("Enter the number of members travelling");
                            no = Integer.parseInt(in.readLine());
                            System.out.println("Enter your name:");
                            name = in.readLine();
                            System.out.println("Enter your gender");
                            gender = in.readLine();
                            System.out.println("Enter your age");
                            age = Integer.parseInt(in.readLine());
             if (age<=5)
             {
                 System.out.println("Fare = Rs.0");
             }
               if (age>5 && age<60)
                {
                    System.out.println("Fare= Rs.150 for non a/c and Rs.250 for a/c");
                }
                if (age>=60)
                {
                   System.out.println ("Fare = Rs.100 for non a/c and Rs.200 for a/c");
                }
            }
                 System.out.println(" your pnr n. is 123456789");
                if (opt.equals ( "n") || opt.equals  ("no") );
                {
                System.out.println (" thank you for using online railway booking");

        }
    }
}
          if ( org.equals ("Kolkata" ))
                  {
                      System.out.println("train - east coast Express" +
                                    "train no. - 2842" +
                                    "Departure time - 11:45 at Kolkata Howrah station" +
                                    " Arrival time - 08:00 (day 2) at secundrabad station" +
                                    (""));
               System.out.println("book now?");
               opt = in.readLine();
               {
                    if ( opt.equals ( "y") || opt.equals ( "yes") )
                   {

                            System.out.println("Enter the number of members travelling");
                            no = Integer.parseInt(in.readLine());
                            System.out.println("Enter your name:");
                            name = in.readLine();
                            System.out.println("Enter your gender");
                            gender = in.readLine();
                            System.out.println("Enter your age");
                            age = Integer.parseInt(in.readLine());
             if (age<=5)
             {
                 System.out.println("Fare = Rs.0");
             }
               if (age>5 && age<60)
                {
                    System.out.println("Fare= Rs.150 for non a/c and Rs.250 for a/c");
                }
                if (age>=60)
                {
                   System.out.println ("Fare = Rs.100 for non a/c and Rs.200 for a/c");
                }

                    System.out.println(" your pnr n. is 123456789");
                }
                if (opt.equals ( "n") || opt.equals  ("no") );
                {
                System.out.println (" thank you for using online railway booking") ;
            }

        }
    }
            if ( org.equals ("Jaipur" ))
            {
              System.out.println("train - Jaipur- mysore SF Express" +
                                    "train no. - 9767" +
                                    "Departure time - 19:40 at Jaipur junction" +
                                    " Arrival time - 23:45 (day 2)Hyderabad Kacheguda station" +
                                    (""));
                                     System.out.println("book now?");
               opt = in.readLine();
               {
                    if ( opt.equals ( "y") || opt.equals ( "yes") )
                   {

                            System.out.println("Enter the number of members travelling");
                            no = Integer.parseInt(in.readLine());
                            System.out.println("Enter your name:");
                            name = in.readLine();
                            System.out.println("Enter your gender");
                            gender = in.readLine();
                            System.out.println("Enter your age");
                            age = Integer.parseInt(in.readLine());
             if (age<=5)
             {
                 System.out.println("Fare = Rs.0");
             }
               if (age>5 && age<60)
                {
                    System.out.println("Fare= Rs.150 for non a/c and Rs.250 for a/c");
                }
                if (age>=60)
                {
                   System.out.println ("Fare = Rs.100 for non a/c and Rs.200 for a/c");
                }

                     System.out.println(" your pnr n. is 123456789");
                }
                if (opt.equals ( "n") || opt.equals  ("no") );
                {
                System.out.println (" thank you for using online railway booking");
            }
                }
        }
        if ( org.equals ("Banglore"))
        {
              System.out.println("train - kongu Express" +
                                    "train no. - 2639" +
                                    "Departure time - 23:15 at banglore city junction" +
                                    " Arrival time - 10:35 at Hyderabad Kacheguda" +
                                    (""));
               System.out.println("book now?");
               opt = in.readLine();
               {
                    if ( opt.equals ( "y") || opt.equals ( "yes") )
                   {

                            System.out.println("Enter the number of members travelling");
                            no = Integer.parseInt(in.readLine());
                            System.out.println("Enter your name:");
                            name = in.readLine();
                            System.out.println("Enter your gender");
                            gender = in.readLine();
                            System.out.println("Enter your age");
                            age = Integer.parseInt(in.readLine());
             if (age<=5)
             {
                 System.out.println("Fare = Rs.0");
             }
               if (age>5 && age<60)
                {
                    System.out.println("Fare= Rs.150 for non a/c and Rs.250 for a/c");
                }
                if (age>=60)
                {
                   System.out.println ("Fare = Rs.100 for non a/c and Rs.200 for a/c");
                }
             System.out.println(" your pnr n. is 123456789");

                }
                if (opt == "n" || opt == "no");
                {
                System.out.println (" thank you for using online railway booking");
            }

        }
    }
      if ( org.equals ("Mumbai"))
        {
              System.out.println("train - Konark Express" +
                                    "train no. - 2639" +
                                    "Departure time - 15:10 at mumbai central" +
                                    " Arrival time - 07:50 (day 2) at secundrabad junction" +
                                    (""));
               System.out.println("book now?");
               opt = in.readLine();
               {
                    if ( opt.equals ( "y") || opt.equals ( "yes") )
                   {

                            System.out.println("Enter the number of members travelling");
                            no = Integer.parseInt(in.readLine());
                            System.out.println("Enter your name:");
                            name = in.readLine();
                            System.out.println("Enter your gender");
                            gender = in.readLine();
                            System.out.println("Enter your age");
                            age = Integer.parseInt(in.readLine());
                    if (age<=5)
             {
                 System.out.println("Fare = Rs.0");
             }
               if (age>5 && age<60)
                {
                    System.out.println("Fare= Rs.150 for non a/c and Rs.250 for a/c");
                }
                if (age>=60)
                {
                   System.out.println ("Fare = Rs.100 for non a/c and Rs.200 for a/c");
                }
             System.out.println(" your pnr n. is 123456789");

                }
                if (opt == "n" || opt == "no");
                {
                System.out.println (" thank you for using online railway booking");
            }



}


    }
}
break;
default: System.out.println("wrong choice");
}
}

catch ( Exception e ){}

}

    private void cancel() throws IOException
         {
              System.out.println("Enter the PNR number");
             pnr = Integer.parseInt(in.readLine());
             System.out.println("Enter the month of travel");
             month = in.readLine();
               if(month == m)
             {
                 System.out.println("cancellation charges= Rs.60");
                 System.out.println("your refund will be sent to your account within 10 business days");
                }
                 if(month != m)
                {
                   System.out.println(" your refund will be sent to your account within 10 business days");
                }
                 else
                {
                    System.out.println("invalid choice");

                }
            }


}
