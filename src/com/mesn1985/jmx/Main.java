package com.mesn1985.jmx;

import javax.management.*;
import java.lang.management.ManagementFactory;

public class Main {

    public static void main(String[] args) throws
            MalformedObjectNameException,
            NotCompliantMBeanException,
            InstanceAlreadyExistsException,
            MBeanRegistrationException,
            InterruptedException {

        MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();

        Person mBean = new Person();
        ObjectName objectName = new ObjectName("com.mesn1985.jmx:type=Person");

        mBeanServer.registerMBean(mBean,objectName);

        while(!mBean.getName().equals("exit")){
            System.out.println(mBean);
            Thread.sleep(2000);
        }

    }
}
