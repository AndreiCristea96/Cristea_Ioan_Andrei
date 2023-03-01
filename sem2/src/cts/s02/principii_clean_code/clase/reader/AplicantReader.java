package cts.s02.principii_clean_code.clase.reader;

import cts.s02.principii_clean_code.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;

public interface AplicantReader {
    List<Aplicant> readAplicants(String fileName) throws FileNotFoundException;
}
