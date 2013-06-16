package com.alibaba.druid.bvt.sql.eval;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.druid.sql.visitor.SQLEvalVisitorUtils;
import com.alibaba.druid.util.JdbcConstants;


public class EvalTest_add_short extends TestCase {
    public void test_byte() throws Exception {
        Assert.assertEquals(3, SQLEvalVisitorUtils.evalExpr(JdbcConstants.MYSQL, "? + ?", (short) 1, (byte) 2));
    }
    
    public void test_byte_1() throws Exception {
        Assert.assertEquals(3, SQLEvalVisitorUtils.evalExpr(JdbcConstants.MYSQL, "? + ?", (short) 1, "2"));
    }
    
    public void test_byte_2() throws Exception {
        Assert.assertEquals(null, SQLEvalVisitorUtils.evalExpr(JdbcConstants.MYSQL, "? + ?", (short) 1, null));
    }
}