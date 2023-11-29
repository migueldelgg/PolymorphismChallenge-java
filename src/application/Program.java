package application;

import entities.Leason;
import entities.Task;
import entities.Video;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.print("Quantas aulas tem o curso? ");
        int n = sc.nextInt();

        List<Leason> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da "+(1+i)+"a aula:");
            System.out.print("Conteúdo ou tarefa (c/t)? ");
            char response = sc.next().charAt(0);
            System.out.print("Título: ");
            sc.nextLine();
            String title = sc.nextLine();
            if (response == 'c') {
                System.out.print("URL do vídeo: ");
                String url = sc.next();
                System.out.print("Duração em segundos: ");
                int seconds = sc.nextInt();

                list.add(new Video(title, url, seconds));
            }
            else if (response == 't') {
                System.out.print("Descrição: ");
                String description = sc.nextLine();
                System.out.print("Quantidade de questões: ");
                int questionCount = sc.nextInt();

                list.add(new Task(title,description,questionCount));
            }
            System.out.println();
        }
        int sum = 0;
        for (Leason c: list) {
            sum += c.duration();
        }
        System.out.println("DURAÇÃO TOTAL DO CURSO = "+ sum);

        sc.close();
    }
}
