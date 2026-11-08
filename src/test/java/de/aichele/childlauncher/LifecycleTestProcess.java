package de.aichele.childlauncher;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public final class LifecycleTestProcess {
    private LifecycleTestProcess() {}

    public static void main(String[] args) throws Exception {
        switch (args[0]) {
            case "sleep" -> Thread.sleep(Long.parseLong(args[1]));
            case "ready-stop" -> {
                System.out.println("Done (0.1s)!");
                System.out.flush();
                String line = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8)).readLine();
                System.exit("stop".equals(line) ? 0 : 3);
            }
            case "never-ready" -> Thread.sleep(60_000);
            case "ignore-stop" -> {
                Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                    try {
                        Thread.sleep(60_000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }));
                while (true) {
                    System.out.println("x".repeat(1024));
                    System.out.flush();
                }
            }
            default -> throw new IllegalArgumentException("Unknown test process mode: " + args[0]);
        }
    }
}
