public class Main {
    public static void main(String[] args) {
        /*System.out.println("****");
/*
        // ESTRARRE IL NOME, COGNOME DEI CLIENTI DEL 1982
        SELECT * FROM clienti
        WHERE EXTRACT(YEAR FROM datanascita) = 1982;

        //ESTRARRE IL NUMERO DELLE FATTURE CON IVA AL 20%
        SELECT numerofattura FROM fatture
        WHERE iva = 20

        //RIPORTARE IL NUMERO DI FATTURE E LA SOMMA DEI RELATIVI IMPORTI DIVISI PER ANNO DI FATTURAZIONE
        SELECT (datafattura), COUNT(*), SUM(importo) FROM fatture
        GROUP BY(datafattura);


        //ESTRARRE I PRODOTTI ATTIVATI NEL 2017 E CHE SONO IN PRODUZIONE OPPURE IN COMMERCIO
        SELECT * FROM prodotti
        WHERE EXTRACT(YEAR FROM dataattivazione) = 2017
        AND (inproduzione >= '2023-01-01' OR incommercio >= '2023-01-01');

        //CONSIDETANDO SOLTANTO LE FATTURE CON IVA AL 20%, ESTRARRE L NUMERO DI FATTURE PER OGNI ANNO
        SELECT EXTRACT(YEAR FROM datafattura), COUNT(*) FROM fatture
        WHERE iva = 20
        GROUP BY EXTRACT(YEAR FROM datafattura);

        //ESTRARRE GLI ANNI IN CUI SONO STATE REGISTRATE PIù DI 2 FATTURE CON TIPOLOGIA A
        SELECT EXTRACT(YEAR FROM datafattura), COUNT(*) FROM fatture
        WHERE tipologia = 'A'
        GROUP BY EXTRACT(YEAR FROM datafattura)
        HAVING COUNT(*) > 2;

        //RIPORTARE L'ELENCO DELLE FATTURE(NUMERO IMPORTO, IVA E DATA) CON L'AGGIUNTA DEL NOME DEL FORNITORE

*/
    }
}