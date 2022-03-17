import java.util.*;


class Contact implements Comparable<Contact>
{
private String firstName;
private String lastName;
private long phoneNumber;

Contact(String fname,String lname,long phno)
{
firstName=fname;
lastName=lname;
phoneNumber=phno;

}
void setFirstName()
{
this.firstName=firstName;
}
void setLastName()
{
this.lastName=lastName;
}

String getFirstName()
{
return firstName;
}
String getLastName()
{
return lastName;
}


@Override
public int compareTo(Contact o)
{
return getFirstName().compareTo(o.getFirstName());
}
}



class AddressBook
{
static Set<Contact> contacts;
public AddressBook()
{
contacts= new TreeSet<Contact>();
}

public static void main(String a[])
{
AddressBook ob=new AddressBook();

contacts.add(new Contact("Prachi","Mohanty",1234568809));


Iterator it=contacts.iterator();
while(it.hasNext())
System.out.println(it.next());
}

}

