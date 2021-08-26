package me.codethink.asmbridge.sample;


import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Opcodes;

public class CustomAdapter extends ClassVisitor {

    public CustomAdapter(final ClassVisitor classVisitor) {
        super(Opcodes.ASM5, classVisitor);
    }

    @Override
    public void visit(final int i, final int i1, final String s, final String s1, final String s2, final String[] strings) {
        super.visit(i, i1, s, s1, s2, strings);

        if (s != null && (s.endsWith("Activity"))) {
            Logger.log("Class name ends with Activity: " + s);
        }
    }



}