# Prodavnica
//Zavrsni ispit IT OiP

//Napisati aplikaciju za prodavnicu na programskom jeziku java.

//U paketu artikli postoji Artikal. Artiklu se može vratiti naziv i izračunati cena za zadatu količinu.
//U paketu artikli postoji Povrće. Povrće je artikal koji ima jedinicu mere, cenu po jedinici mere i naziv.
//• Može se vratiti jedinica mere.
//• Ispisuje se u formatu: Naziv [cena/jedinica]
//U paketu artikli postoji Voće. Voće je artikal koji ima jedinicu mere, cenu po jedinici mere, naziv i tip (Sveže, Smrznuto, Suvo).
//• Može se vratiti jedinica mere.
//• Ispisuje se u formatu: Naziv-Tip [cena/jedinica]
//U paketu artikli postoji Kozmetika. Kozmetika je artikal koji ima naziv i cenu po komadu.
//• Ispisuje se u formatu: Naziv [cena]

//U paketu prodavnica postoji Račun. 
//Račun ima jedinstveni automatski generisani identifikator, listu artikala i njihovih količina (ceo broj), i datum izdavanja (dan, //mesec, godina). 
//Liste artikala i količina se stvara prazna, a artikli i količine se kasnije dodaju zajedno zadavanjem dva parametra.
//• Mogu se dohvatiti identifikator, dan, mesec i godina.
//• Može se izračunati ukupna cena svih artikala
//• Ispisuje se u formatu: 
//Racun br. id (dan.mesec.godina) 
//- artikal1 količina1 cena za kolicinu1 
//- artikal2 količina2 cena za kolicinu2 
//- artikal3 količina3 cena za kolicinu3 
//Ukupna cena: xxx dinara

//U paketu prodavnica postoji Prodavnica. 
//Prodavnica ima naziv, adresu i listu računa. Lista računa se stvara prazna, a računi se kasnije dodaju jedan po jedan.
//• Može se vratiti prvi račun za izabrani datum, ukoliko ne postoji takav račun, ispisati grešku korisniku.
//• Može se vratiti najskuplji račun. U slučaju da nema ni jednog računa ispisati grešku korisniku.
//• Može se vratiti najjeftiniji račun. U slučaju da nema ni jednog računa ispisati grešku korisniku.
//• Može se vratiti prosečna cena svih računa. U slučaju da nema ni jednog računa ispisati grešku korisniku.
//• Ispisuje se u formatu: 
//Prodavnica: naziv prodavnice, adresa 
//---------------------------------------------------
//Najskuplji račun: xxx dinara 
//Najjeftiniji račun: xxx dinara 
//Prosečna cena računa: xxx dinara 
//-------------------------------------------------- 
//Racun1 
//-------------------------------------------------- 
//Racun2 
//-------------------------------------------------- 
//Racun3 
//-------------------------------------------------- …

//Napisati glavni program koji ispituje funkcionalnosti ovih klasa.

//Date date = new Date(); 
//LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(); 
//dan = localDate.getDayOfMonth(); 
//mesec = localDate.getMonthValue(); 
//godina = localDate.getYear(); 
//id = auto++; (polje auto definišite kao static int auto = 0;)
