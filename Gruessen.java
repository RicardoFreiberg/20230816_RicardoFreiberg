public class Gruessen{

	String vorname;
	String nachname;
	int alter;

public Gruessen(String vorname,String nachname,int alter){

	this.vorname=vorname;
	this.nachname = nachname;
	this.alter = alter;

}
public String gruesse(){

	return("Hallo ich bin"+" " +vorname+" "+ nachname+" "+ "und ich bin"+" "+ alter+" "+ "jahr alt, was ein toller Tag für etwas Java und Git.");
}
}