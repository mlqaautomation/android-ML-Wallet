package com.driverInstance;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AppiumServer {

    AppiumDriverLocalService service;
    String osName = System.getProperty("os.name").toLowerCase();

    AppiumServiceBuilder builder;

    //0-Param Constructor
    public AppiumServer() {

    }

    // Start Server Based On Current OS Usage
    public void startServer() throws IOException {
        switch (osName) {
            case "mac":
                try {
                    System.out.println("[BEFORESUITE] Starting Appium in: ");
                    Map<String, String> env = new HashMap<>(System.getenv());
                    env.put("PATH", "/usr/local/bin:" + env.get("PATH"));
                    builder = new AppiumServiceBuilder().withIPAddress("127.0.0.1").usingPort(4723).withArgument(() -> "--base-path", "/wd/hub")
                            .withArgument(() -> "--allow-insecure", "chromedriver_autodownload")
                            .withEnvironment(env).usingDriverExecutable(new File("/usr/local/bin/node"))
                            .withArgument(GeneralServerFlag.LOG_LEVEL, "error")
                            .usingAnyFreePort()
                            .withAppiumJS(new File(
                                    "/Applications/Appium Server GUI.app/Contents/Resources/app/node_modules/appium/build/lib/main.js"));
                    service = AppiumDriverLocalService.buildService(builder);
                    builder.withLogFile(new File("./appiumLogs/appiumLogs" + System.currentTimeMillis()));
                } catch (AppiumServerHasNotBeenStartedLocallyException e) {
                    e.printStackTrace();
                } catch (Exception es) {
                    es.printStackTrace();
                }
                break;
            case "linux":
                try {
                    String nodePath = "/usr/bin/node"; // Path to the Node.js executable
                    String appiumJSPath = "/usr/bin/appium"; // Path to the Appium main.js file
                    service = AppiumDriverLocalService.buildService(
                            new AppiumServiceBuilder()
                                    .usingDriverExecutable(new File(nodePath))
                                    .withAppiumJS(new File(appiumJSPath))
                                    .withIPAddress("127.0.0.1")
                                    .usingPort(4723)
                                    .withArgument(GeneralServerFlag.LOG_LEVEL, "error")
                    );
                    if (service.isRunning()) {
                        service.stop();
                    } else {
                        service.start();
                        service.clearOutPutStreams();
                        System.out.println("[BEFORESUITE] Appium Server Started Sucessfully.");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            default:
                service = AppiumDriverLocalService.
                        buildService(new AppiumServiceBuilder()
                                .usingDriverExecutable(new File("C:\\Program Files\\nodejs\\node.exe"))
                                .withAppiumJS(new File("C:\\Users\\" + System.getProperty("user.name")
                                        + "\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
                                .withIPAddress("127.0.0.1").usingPort(4723)
                                .withArgument(() -> "--base-path", "/wd/hub")
                                .usingAnyFreePort()
                                .usingDriverExecutable(new File("C:\\Program Files\\nodejs\\node.exe"))
                                .withArgument(GeneralServerFlag.LOG_LEVEL, "error"));
                if (service.isRunning()) {
                    service.stop();
                } else {
                    service.start();
                    service.clearOutPutStreams();
                    System.out.println("[BEFORESUITE] Appium Server Started Sucessfully.");
                }
        }//end switch
    }

    //Stop Server
    public void stopServer() {
        service.stop();
    }
}
