package JAVA;

/**
 * @author: MA
 * @Date: 2021/10/19 8:49
 */
public class JavaSe {
    /**
     * 1 JDK JRE JVM
     *  JDK   (Java Development Kit)  java开发工具包  这个工具包的版本1.2 ~ 版本 1.4 被称为 Java SDK
     *  JRE   (Java runtime environment) java运行环境
     *  JVM   (Java Virtual Machine) java虚拟机
     *
     *  JDK(给开发人员使用):
     *    JDK中包含JRE，在JDK的安装目录下有一个名为jre的目录，里面有两个文件夹bin和lib，
     *    在这里可以认为bin里的就是jvm，lib中则是jvm工作所需要的类库，而jvm和lib合起来就称为jre
     *    JDK是整个JAVA的核心，包括了Java运行环境JRE（Java Runtime Environment）、
     *    一堆Java工具（javac/java/jdb等）和Java基础的类库（即Java API 包括rt.jar）
     *    ①SE(J2SE)，standard edition，标准版，是我们通常用的一个版本，从JDK 5.0开始，改名为Java SE。
     * 　　②EE(J2EE)，enterprise edition，企业版，使用这种JDK开发J2EE应用程序，从JDK 5.0开始，改名为Java EE。
     * 　　③ME(J2ME)，micro edition，主要用于移动设备、嵌入式设备上的java应用程序，从JDK 5.0开始，改名为Java ME
     *
     *  JRE(给普通用户使用):
     *     JRE中包含了
     *     Java virtual machine（JVM）
     *     runtime class libraries
     *     Java application launcher
     *     在Java平台下，所有的Java程序都需要在JRE下才能运行。
     *     只有JVM还不能进行class的执行，因为解释class的时候，JVM需要调用解释所需要的类库lib
     *     这些是运行Java程序的必要组件。
     * 　　 与大家熟知的JDK不同，JRE是Java运行环境，并不是一个开发环境
     *     所以没有包含任何开发工具（如编译器和调试器），只是针对于使用Java程序的用户。
     *
     *  JVM(给普通用户使用):
     *     JVM是JRE的一部分，它是一个虚拟出来的计算机，
     *     是通过在实际的计算机上仿真模拟各种计算机功能来实现的。
     *     JVM有自己完善的硬件架构，如处理器、堆栈、寄存器等，还具有相应的指令系统
     *     JVM是Java实现跨平台最核心的部分，
     *     所有的Java程序会首先被编译为.class的类文件，
     *     JVM的主要工作是解释自己的指令集（即字节码）并映射到本地的CPU的指令集或OS的系统调用。
     *     Java面对不同操作系统使用不同的虚拟机，依次实现了跨平台。
     *     JVM对上层的Java源文件是不关心的，它关心的只是由源文件生成的类文件
     *
     *     JAVA是先编译再解释的语言，是两种语言的结合
     *     编译语言是javac.exe 在JVM中将java程序编译成.class文件
     *     解释语言是java.exe JVM主要工作就是解释自己的指令集 (解释class的时候，JVM需要调用解释所需要的类库lib->JRE运行环境所带的类库)
     *     并映射到本地的CPU的指令集或OS的系统调用
     *
     *
     *
     * */
    /**
     *  2
     */
}
