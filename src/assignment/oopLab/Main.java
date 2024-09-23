package assignment.oopLab;

import assignment.oopLab.patients.Patient;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of patients: ");
        int numPatients= sc.nextInt();
        sc.nextLine();

        Patient[] patients= new Patient[numPatients];
        for(int i= 0; i<numPatients; i++){
            System.out.print("Enter pid: ");
            int pid= sc.nextInt();
            sc.nextLine();

            System.out.print("Enter pname: ");
            String pname= sc.nextLine();

            System.out.print("Enter history: ");
            String history= sc.nextLine();

            System.out.print("Enter medicines: ");
            String medicines= sc.nextLine();

            patients[i]= new Patient(pid, pname, history);
            patients[i].setMedicines(medicines);
        }

        System.out.println("Medicines for all patients: ");
        for (int i = 0; i < patients.length; i++) {
            System.out.println("Patient ID: " + patients[i].getPid() + ", Medicines: " + patients[i].getMedicines());
        }

    }
}
