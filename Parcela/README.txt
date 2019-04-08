	Parcela ima jedinstven automatski generisan celobrojan identifikator i zadatu povrsinu(u kvadratnim metrima) 
	prilikom kreiranja. Mogu da joj se dohvate sadrzani podaci, kao i jednoslovna vrsta(char). 
	Moze da joj se odredi prinos u periodu zadatom brojem godina. 
	Moze da se sastavi tekstualni opis u obliku VRSTA-ID[POVRSINA].


	Suma je parcela koja ima zadate povrsinu koju zauzimaju stabla, 
	prinos po zrelom stablu i period sazrevanja od zasada do sece izražen u celom broju godina.Oznaka vrste je S. 
	Prinos se ostvaruje formulom povrsina_parcele/povrsina_stabla*prinos_stabla*(godine/sazrevanje).
	Tekstualni oblik je *Parcela:(povrsstabla,prinosSt,Period).
	*Ovo se ostvaruje pozivom super.toString();

	Njiva je parcela koja ima zadat godisnji prinos po kvadratnom metru.
	Prinos po kvadratnom metru može da se promeni. Oznaka vrste je N. 
	Prinos njive se racuna po formuli: povrsina_parcele*prinosPoKvM. Tekstualni oblik je Parcela:PrinosPoKvM.

	Napisati i glavni program koji kreira niz parcela koje mogu da budu ili sume ili njive 
	i ispisuje njihov prinos u toku 3 godine.

