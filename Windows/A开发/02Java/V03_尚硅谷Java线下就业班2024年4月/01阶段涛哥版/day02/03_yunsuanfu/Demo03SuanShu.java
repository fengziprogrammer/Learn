// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Demo03SuanShu.java

import java.io.PrintStream;

public class Demo03SuanShu
{

	public Demo03SuanShu()
	{
	}

	public static void main(String args[])
	{
		int i = 10;
		i++;
		System.out.println(i);
		System.out.println("=============");
		int j = 10;
		int k = j++;
		System.out.println(k);
		System.out.println(j);
		System.out.println("=============");
		int l = 10;
		int i1 = 20;
		int j1 = (l++ + --i1) - --l;
		System.out.println(j1);
		System.out.println("=============");
		int k1 = 100;
		k1 = k1++;
		System.out.println(k1);
		System.out.println(k1);
	}
}
