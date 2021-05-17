package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class YahtzeTest {
private static ValeurTest[]creatTabOfDocument(String nomFich){
    FileInputStream fileInputStream = ouvrirFichierLecture(nomFich);//ouvre le fichier
    Scanner fichier = new Scanner(fileInputStream);
    String ligne = "";// initialise la variable ligne
    ValeurTest[] tab = new ValeurTest[nombredeligne(nomFich)];// cree un tableau de type document

    for (int i = 0; fichier.hasNext(); i++) {
        ligne = fichier.nextLine();//la ligne prend chaque donné du fichier lue
        String[] values = ligne.split(" ");// la ligne est affecté au tableau et elle splité par l'espace
        ArrayList<ValeurTest>listeTest=new ArrayList<>();
        listeTest.add(Integer.parseInt(values[0]);
        listeTest.add(Integer.parseInt(values[1]);
        listeTest.add(Integer.parseInt(values[2]);
        listeTest.add(Integer.parseInt(values[3]);
        listeTest.add(Integer.parseInt(values[4]);


    }


    return tab;// retourne le tableau
    }
    private static int nombredeligne(String nomFich) {

        Path path = Paths.get(nomFich); //prend le chemin du fichier grace au nomFich

        long lines = 0;// initialise la variable lines
        try {

            lines = Files.lines(path).count();

        } catch (IOException e) {//catch l'exception qui peut survenir à cause du Files.lines

        }

        return (int) lines;//retourne le nombre de ligne du documement
    }

    private static FileInputStream ouvrirFichierLecture(String nomFichier) {
        FileInputStream fichier = null;
        try {
            fichier = new FileInputStream(nomFichier);
        } catch (FileNotFoundException ex) {
            System.out.println("Erreur d’ouverture de fichier");
        }
        return fichier;
    }
}
