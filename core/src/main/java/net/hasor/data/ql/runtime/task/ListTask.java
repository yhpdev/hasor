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
package net.hasor.data.ql.runtime.task;
import net.hasor.data.ql.result.ListModel;
import net.hasor.data.ql.runtime.QueryContext;
import net.hasor.data.ql.runtime.TaskType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
/**
 *
 * @author 赵永春(zyc@hasor.net)
 * @version : 2017-03-23
 */
public class ListTask extends AbstractPrintTask {
    private AbstractPrintTask bodyTask;
    public ListTask(String nameOfParent, AbstractTask parentTask, AbstractTask dataSource) {
        super(nameOfParent, parentTask, dataSource);
    }
    //
    //
    public void setListBody(AbstractPrintTask bodyTask) {
        this.bodyTask = bodyTask;
        this.addFieldTask("", bodyTask);
    }
    @Override
    public Object doTask(QueryContext taskContext, Object inData) throws Throwable {
        //
        Collection<Object> listData = null;
        if (inData == null) {
            listData = new ArrayList<Object>();
        } else {
            if (!(inData instanceof Collection)) {
                if (inData.getClass().isArray()) {
                    listData = new ArrayList<Object>();
                    for (Object obj : (Object[]) inData) {
                        listData.add(obj);
                    }
                } else {
                    listData = Arrays.asList(inData);
                }
            } else {
                listData = (Collection<Object>) inData;
            }
        }
        //
        ListModel listModel = new ListModel();
        for (Object listItem : listData) {
            Object taskValue = null;
            if (TaskType.F.equals(this.bodyTask.getTaskType())) {
                taskValue = this.bodyTask.doTask(taskContext, listItem);
            } else {
                taskValue = this.bodyTask.getValue();
            }
            listModel.add(taskValue);
        }
        return listModel;
    }
}