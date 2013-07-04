/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.more.classcode;
/**
* ʵ��AOP�ķ�����������ͨ����������{@link AopFilterChain}����ķ�������ִ�й������ڵ����һ���ڵ㡣
* ��������ִ�е����һ���ڵ�ʱ��ʽִ�з������á�������������������ط������ý������ֱ��ʹ��
* callMethod�����invoke����ֱ�ӵ���Ŀ�귽��������������ֵȻ���������������
* ���ö��{@link AopInvokeFilter}������ɹ���������
* <br/><img width="400" src="doc-files/classcode_struct.png"/>
* @version 2010-9-3
* @author ������ (zyc@byshell.org)
*/
public interface AopInvokeFilter {
    /**
     * ��������AOP���صķ���ʱִ�и÷�����chain�������������������ִ�й������������ֱ�ӵ���
     * callMethod�����invoke���������������������ֱ��ִ��Ŀ�귽��������ȡ����ֵ��
     * @param target Ŀ�����
     * @param method �����õķ����ö����а����˱����õĴ���������ԭʼ������
     * @param args ����AOP���ط���ʱ�ķ���������
     * @param chain AOP������������
     * @return ���ط�������ֵ��������һ�����ù���������ֱ�ӷ��ط����ص���
     * @throws Throwable �����ִ��ʱ�����쳣��
     */
    public Object doFilter(Object target, Method method, Object[] args, AopFilterChain chain) throws Throwable;
}