package ck.tyut.first.classloader;

import java.io.*;

public class MyClassLoad extends ClassLoader {

    public static void main(String[] args) throws Exception {
        String srcPath= "";
        String destPath="";
        FileInputStream fis = new FileInputStream(srcPath);
        FileOutputStream fos = new FileOutputStream(destPath);
        cypher(fis,fos);
        fis.close();
        fos.close();
    }


    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String classFileName = name + ".class";
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("");
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            //解密
            cypher(fis,bos);
            fis.close();
            byte[] bytes = bos.toByteArray();
            return defineClass(null,bytes,0,bytes.length);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return super.findClass(name);
    }

    private static void cypher(InputStream in , OutputStream out) throws Exception{
        int b=-1;
        while ((b=in.read()) != -1){
            out.write(b^0Xff);
        }
    }


}
