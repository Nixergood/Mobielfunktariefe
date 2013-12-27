import java.util.Scanner;

public class Mobilfunktarief1   {
	
	private static Scanner eingabe;
	
	public static void main (String[] args) {
	
	
		//while Schleife
		
		int i=0;
		
		while(i<1)
		{
		
		//Eingabe Variablen
		
		double minuten_pro_monat_mobitel;		/* Mobitel */
		double sms_pro_monat_mobitel;
		
		double minuten_pro_monat_toptel;		/* Toptel */
		double sms_pro_monat_toptel;
		
		double minuten_pro_monat_tricatel;		/* Tricatel */
		double sms_pro_monat_tricatel;
		
		double minuten_pro_monat_parameter;		/* Parameter */
		double sms_pro_monat_parameter;
		
		double minuten_pro_monat_fonmax;		/* Fonmax */
		double minuten_pro_monat_fonmax_2;
		double minuten_pro_monat_fonmax_3;
		
		double sms_pro_monat_fonmax;			/* Fonmax */
		double sms_pro_monat_fonmax_2;
		double sms_pro_monat_fonmax_3;
		
		
		//Rechen Variablen
		
		double ergebniss_minuten_mobitel;		/* Mobitel */
		double ergebniss_sms_mobitel;
		
		double ergebniss_minuten_toptel;		/* Toptel */
		double ergebniss_sms_toptel;
		
		double ergebniss_minuten_tricatel;		/* Tricatel */
		double ergebniss_sms_tricatel;
		
		double ergebniss_minuten_parameter;		/* Parameter */
		double ergebniss_sms_parameter;
		
		double ergebniss_minuten_pro_monat_fonmax = 0;		/* Fonmax */				/* Eclipse wollte das programm ohne die initialized variable (=0) nicht compilieren! */
		double ergebniss_sms_pro_monat_fonmax = 0;			/* Fonmax */				/* Eclipse wollte das programm ohne die initialized variable (=0) nicht compilieren! */
		
		//Gesamtergebnisse Variablen
		
		double gesamt_mobitel;					/* Mobitel */
		
		double gesamt_toptel;					/* Toptel */
		
		double gesamt_tricatel;					/* Tricatel */
		
		double gesamt_parameter;				/* Parameter */
		
		double gesamt_fonmax;					/* Fonmax */
		
		
		//Parameter Eingabe Variablen 
		
		double parameter_freiminuten;			
		double parameter_freisms;
		
		float parameter_preis_pro_minute;		//Eingabe im Compilierten Programm mit Komma !
		float parameter_preis_pro_sms;			//Eingabe im Compilierten Programm mit Komma !
		float parameter_grundgebuehr;			//Eingabe im Compilierten Programm mit Komma !
		
		int parameter_frage;					/* Zusätzliche Parameter ? (1=JA/0=NEIN) */
		
		
		
		eingabe = new Scanner(System.in);
		
			
			
			//eingabe Minuten
			
			System.out.println("Bitte geben sie ihre Minute, die sie im Monat telefonieren ein:");
			minuten_pro_monat_mobitel = eingabe.nextDouble();
			
			minuten_pro_monat_toptel = minuten_pro_monat_mobitel;
			minuten_pro_monat_tricatel = minuten_pro_monat_mobitel;	
			minuten_pro_monat_parameter = minuten_pro_monat_mobitel;
			minuten_pro_monat_fonmax = minuten_pro_monat_mobitel;
			
			
			//Eingabe SMS
			
			System.out.println("Bitte geben sie ihre SMS, die sie pro Monat versenden ein:");
			sms_pro_monat_mobitel = eingabe.nextDouble();
			
			sms_pro_monat_toptel = sms_pro_monat_mobitel;
			sms_pro_monat_tricatel = sms_pro_monat_mobitel;
			sms_pro_monat_parameter = sms_pro_monat_mobitel;
			sms_pro_monat_fonmax = sms_pro_monat_mobitel;
				
			
			//Mobitel
				
				//Rechnung Mobitel Minuten
			
				System.out.println("");
				System.out.println("");
				System.out.println("Ergebnisse Mobitel:");
				System.out.println("");
				
				minuten_pro_monat_mobitel = minuten_pro_monat_mobitel-50;
				
				if(minuten_pro_monat_mobitel < 0)
				{
					System.out.println("Sie haben mehr Freiminuten im Monat, als sie telefonieren (Desswegen kosten = 0)");
					ergebniss_minuten_mobitel = 0;
				}
				else 
				{
					ergebniss_minuten_mobitel = (minuten_pro_monat_mobitel*0.19);
				}
		
				//Rechnung Mobitel SMS
	
				sms_pro_monat_mobitel = sms_pro_monat_mobitel-60;
				
				if(sms_pro_monat_mobitel < 0)
				{
					System.out.println("Sie haben mehr freie SMS im Monat, als sie senden (Desswegen kosten = 0)");
					ergebniss_sms_mobitel = 0;
				}
				else
				{
					ergebniss_sms_mobitel = (sms_pro_monat_mobitel*0.21);
				}
				
				//Ergebniss Mobitel
				
				System.out.println("");
				System.out.println("--Die monatlichen Kosten für den Anbieter Mobitel sind:" + (8.99+ergebniss_minuten_mobitel+ergebniss_sms_mobitel) + "Euro pro Monat--");
				gesamt_mobitel = (8.99+ergebniss_minuten_mobitel+ergebniss_sms_mobitel);
				
				
				
					//Toptel
				
					//Rechnung Toptel Minuten
				
					System.out.println("");
					System.out.println("");
					System.out.println("Ergebnisse Tobtel:");
					System.out.println("");
					
					minuten_pro_monat_toptel = minuten_pro_monat_toptel-100;
				
					if(minuten_pro_monat_toptel < 0)
					{
						System.out.println("Sie haben mehr Freiminuten im Monat, als sie telefonieren (Desswegen kosten = 0)");
						ergebniss_minuten_toptel = 0;
					}
					else 
					{
						ergebniss_minuten_toptel = (minuten_pro_monat_toptel*0.21);
					}
					
					//Rechnung Toptel SMS
	
					sms_pro_monat_toptel = sms_pro_monat_toptel-120;
				
					if(sms_pro_monat_toptel < 0)
					{
						System.out.println("Sie haben mehr freie SMS im Monat, als sie senden (Desswegen kosten = 0)");
						ergebniss_sms_toptel = 0;
					}
					else
					{
						ergebniss_sms_toptel = (sms_pro_monat_toptel*0.22);
					}
				
					//Ergebniss Toptel
				
					System.out.println("");
					System.out.println("--Die monatlichen Kosten für den Anbieter Toptel sind:" + (14.99+ergebniss_minuten_toptel+ergebniss_sms_toptel) + "Euro pro Monat--");
					gesamt_toptel = (14.99+ergebniss_minuten_toptel+ergebniss_sms_toptel);
				
				
				
						//Tricatel
				
						//Rechnung Tricatel Minuten
				
						System.out.println("");
						System.out.println("");
						System.out.println("Ergebnisse Tricatel:");
						System.out.println("");
						
						minuten_pro_monat_tricatel = minuten_pro_monat_tricatel-130;
	
						if(minuten_pro_monat_tricatel < 0)
						{
							System.out.println("Sie haben mehr Freiminuten im Monat, als sie telefonieren (Desswegen kosten = 0)");
							ergebniss_minuten_tricatel = 0;
						}
						else 
						{
							ergebniss_minuten_tricatel = (minuten_pro_monat_tricatel*0.05);
						}
	
						//Rechnung Tricatel SMS
				
						sms_pro_monat_tricatel = sms_pro_monat_tricatel-130;
				
						if(sms_pro_monat_tricatel < 0)
						{
							System.out.println("Sie haben mehr Freie SMS im Monat, als sie senden (Desswegen kosten = 0)");
							ergebniss_sms_tricatel = 0;
						}
						else
						{
							ergebniss_sms_tricatel = (sms_pro_monat_tricatel*0.09);
						}
				
						//Ergebniss Tricatel
				
						System.out.println("");
						System.out.println("--Die monatlichen Kosten für den Anbieter Tricatel sind:" + (19.99+ergebniss_minuten_tricatel+ergebniss_sms_tricatel) + "Euro pro Monat--");
						gesamt_tricatel = (19.99+ergebniss_minuten_tricatel+ergebniss_sms_tricatel);
	
						
						
							//Fonmax
						
							//Rechnung Fonmax Minuten
						
							System.out.println("");
							System.out.println("");
							System.out.println("Ergebniss Fonmax:");
							System.out.println("");
	
							if(minuten_pro_monat_fonmax <= 99)
							{
								minuten_pro_monat_fonmax = (minuten_pro_monat_fonmax*0.25);
							}
							else if(minuten_pro_monat_fonmax > 99)
							{
								minuten_pro_monat_fonmax = (99 * 0.25);
								
								minuten_pro_monat_fonmax_2 = minuten_pro_monat_fonmax;
								
								minuten_pro_monat_fonmax_3 = (minuten_pro_monat_fonmax_2 - 99);
								minuten_pro_monat_fonmax_3 = (minuten_pro_monat_fonmax_2 * 0.15);
								
								ergebniss_minuten_pro_monat_fonmax = (minuten_pro_monat_fonmax + minuten_pro_monat_fonmax_3);
							}
						
							//Rechnung Fonmax SMS
							
							if(sms_pro_monat_fonmax <= 99)
							{
								sms_pro_monat_fonmax = (sms_pro_monat_fonmax*0.19);
							}
							else if(sms_pro_monat_fonmax > 99)
							{
								sms_pro_monat_fonmax = (99 * 0.19);
								
								sms_pro_monat_fonmax_2 = sms_pro_monat_fonmax;
								
								sms_pro_monat_fonmax_3 = (sms_pro_monat_fonmax_2 - 99);
								sms_pro_monat_fonmax_3 = (sms_pro_monat_fonmax_2 * 0.11);
								
								ergebniss_sms_pro_monat_fonmax = (sms_pro_monat_fonmax + sms_pro_monat_fonmax_3);
							}
						
							//Ergebniss Fonmax
							
							System.out.println("");
							System.out.println("--Die monatlichen Kosten für den Anbieter Fonmax sind:" + (5.99+ ergebniss_minuten_pro_monat_fonmax + ergebniss_sms_pro_monat_fonmax) + "Euro pro Monat--");
							gesamt_fonmax = (5.99+ ergebniss_minuten_pro_monat_fonmax + ergebniss_sms_pro_monat_fonmax);
						
						
						
						//Prameter
						
						System.out.println("");	
						System.out.println("");
						System.out.println("Wollen sie noch einen weiteren anbieter hinzufügen? (Ja=1/Nein=0)");
						parameter_frage = eingabe.nextInt();
						
							if(parameter_frage == 1)
							{
								System.out.println("");
								System.out.println("Geben sie bitte die monatlichen freiminuten ein (Falls es keine gibt, schreiben sie 0):");
								parameter_freiminuten = eingabe.nextDouble();
								System.out.println("");
								
								System.out.println("Geben sie bitte die monatlichen frei-SMS an (falls es keine gibt, schreiben sie 0):");
								parameter_freisms = eingabe.nextDouble();
								System.out.println("");
								
								System.out.println("Geben sie bitte die kosten pro minute ein (Bitte Komma anstadt Punkt, sonst Fehler):");
								parameter_preis_pro_minute = eingabe.nextFloat();																	//Eingabe im Compilierten Programm mit Komma !
								System.out.println("");
								
								System.out.println("Geben sie die kosten pro SMS ein(Bitte Komma anstadt Punkt, sonst Fehler):");
								parameter_preis_pro_sms = eingabe.nextFloat();																		//Eingabe im Compilierten Programm mit Komma !
								System.out.println("");
								
								System.out.println("geben sie bitte die monatliche grundgebühr ein(Bitte Komma anstadt Punkt, sonst Fehler):");
								parameter_grundgebuehr = eingabe.nextFloat();																		//Eingabe im Compilierten Programm mit Komma !
								System.out.println("");
								
								
								//Rechnung Parameter Minuten
						
								System.out.println("");
								System.out.println("");
								System.out.println("Ergebnisse ihrer eigenen Parameter:");
								System.out.println("");
						
								minuten_pro_monat_parameter = minuten_pro_monat_parameter - parameter_freiminuten;
						
								if(minuten_pro_monat_mobitel < 0)
								{
									System.out.println("Sie haben mehr Freiminuten im Monat, als sie telefonieren (Desswegen kosten = 0)");
									ergebniss_minuten_parameter = 0;
								}
								else 
								{
									ergebniss_minuten_parameter = (minuten_pro_monat_parameter*parameter_preis_pro_minute);
								}
				
								//Rechnung Parameter SMS
			
								sms_pro_monat_mobitel = sms_pro_monat_mobitel - parameter_freisms;
							
								if(sms_pro_monat_parameter < 0)
								{
									System.out.println("Sie haben mehr freie SMS im Monat, als sie senden (Desswegen kosten = 0)");
									ergebniss_sms_parameter = 0;
								}
								else
								{
									ergebniss_sms_parameter = (sms_pro_monat_parameter*parameter_preis_pro_sms);
								}
						
								//Ergebniss Parameter
						
								System.out.println("");
								System.out.println("--Die monatlichen Kosten für ihren Anbieter sind:" + (parameter_grundgebuehr+ergebniss_minuten_parameter+ergebniss_sms_parameter) + "Euro pro Monat--");
								gesamt_parameter = (parameter_grundgebuehr+ergebniss_minuten_parameter+ergebniss_sms_parameter);
							
							
								System.out.println("Hier ist ihr Gesamtergebniss:");
								
								if(gesamt_mobitel < gesamt_toptel && gesamt_mobitel < gesamt_tricatel && gesamt_mobitel < gesamt_parameter && gesamt_mobitel < gesamt_fonmax)
								{
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("----Ihr günstigster Tarief ist: Mobitel.----");
									System.out.println("");
									System.out.println("Jetzt Beginnt das Programm von vorne !");
								}
								else if(gesamt_toptel < gesamt_mobitel && gesamt_toptel < gesamt_tricatel && gesamt_toptel < gesamt_parameter && gesamt_toptel < gesamt_fonmax)
								{
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("----Ihr günstigster Tarif ist: Toptel.----");
									System.out.println("");
									System.out.println("Jetzt Beginnt das Programm von vorne !");
								}
								else if(gesamt_tricatel < gesamt_mobitel && gesamt_tricatel < gesamt_toptel && gesamt_tricatel < gesamt_parameter && gesamt_tricatel < gesamt_fonmax)
								{
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("----Ihr günstigster Tarif ist: Tricatel.----");
									System.out.println("");
									System.out.println("Jetzt Beginnt das Programm von vorne !");
								}
								else if(gesamt_fonmax < gesamt_mobitel && gesamt_fonmax < gesamt_toptel && gesamt_fonmax < gesamt_tricatel && gesamt_fonmax < gesamt_parameter)
								{
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("----Ihr günstigster Tarif ist: Fonmax.----");
									System.out.println("");
									System.out.println("Jetzt Beginnt das Programm von vorne !");
								}
								else if(gesamt_parameter < gesamt_mobitel && gesamt_parameter < gesamt_toptel && gesamt_parameter < gesamt_tricatel && gesamt_parameter < gesamt_fonmax)
								{
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("----Ihr günstigster Tarif ist: Ihr zusätzlich eingegebener Tarief.----");
									System.out.println("");
									System.out.println("Jetzt Beginnt das Programm von vorne !");
								}
							
							}
							else if(parameter_frage == 0)
							{
								System.out.println("Hier ist ihr Gesamtergebniss:");
							
								if(gesamt_mobitel < gesamt_toptel && gesamt_mobitel < gesamt_tricatel && gesamt_mobitel < gesamt_fonmax)
								{
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("----Ihr günstigster Tarief ist: Mobitel.----");
									System.out.println("");
									System.out.println("Jetzt Beginnt das Programm von vorne !");
								}
								else if(gesamt_toptel < gesamt_mobitel && gesamt_toptel < gesamt_tricatel && gesamt_toptel < gesamt_fonmax)
								{
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("----Ihr günstigster Tarif ist: Toptel.----");
									System.out.println("");
									System.out.println("Jetzt Beginnt das Programm von vorne !");
								}
								else if(gesamt_tricatel < gesamt_mobitel && gesamt_tricatel < gesamt_toptel && gesamt_tricatel < gesamt_fonmax)
								{
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("----Ihr günstigster Tarif ist: Tricatel.----");
									System.out.println("");
									System.out.println("Jetzt Beginnt das Programm von vorne !");
								}
								else if(gesamt_fonmax < gesamt_mobitel && gesamt_fonmax < gesamt_toptel && gesamt_fonmax < gesamt_tricatel)
								{
									System.out.println("");
									System.out.println("");
									System.out.println("");
									System.out.println("----Ihr günstigster Tarif ist: Fonmax.----");
									System.out.println("");
									System.out.println("Jetzt Beginnt das Programm von vorne !");
								}
							}
									else
									{
										System.out.println("EINGABE FEHLER!");
									}
						
						
						
						
							
		}
											}						

								}
