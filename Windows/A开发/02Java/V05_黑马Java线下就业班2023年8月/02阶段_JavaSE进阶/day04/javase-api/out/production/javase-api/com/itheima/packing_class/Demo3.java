// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Demo3.java

package com.itheima.packing_class;

import java.io.PrintStream;

public class Demo3
{

	public Demo3()
	{
	}

	public static void main(String args[])
	{
		Integer num = Integer.valueOf(10);
		num = Integer.valueOf(num.intValue() + 20);
		Integer integer = num;
		Integer integer1 = num = Integer.valueOf(num.intValue() + 1);
		Integer  = integer;
		System.out.println(num);
	}
}
