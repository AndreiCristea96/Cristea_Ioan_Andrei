package cts.s02.principii_clean_code.main;

import java.io.FileNotFoundException;
import java.util.List;

import cts.s02.principii_clean_code.clase.Angajat;
import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.clase.reader.AngajatReader;
import cts.s02.principii_clean_code.clase.reader.AplicantReader;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		try {
			AplicantReader aplicantReader = new AngajatReader();
			listaAngajati=aplicantReader.readAplicants("angajati.txt");
			for(Aplicant aplicant1:listaAngajati)
				System.out.println(aplicant1.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
