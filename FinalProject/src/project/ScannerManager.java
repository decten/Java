package project;

import java.util.Scanner;

public class ScannerManager {
  private static ScannerManager instance = null;
  Scanner scanner;
  private ScannerManager() {
    this.scanner = new Scanner(System.in);
  }
  public static ScannerManager getInstance() {
    if(instance == null) instance = new ScannerManager();
    return instance;
  }
}