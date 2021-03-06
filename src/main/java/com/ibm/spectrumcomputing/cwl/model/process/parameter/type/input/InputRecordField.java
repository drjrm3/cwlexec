/*
 * Copyright 2002-2012 the original author or authors.
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
package com.ibm.spectrumcomputing.cwl.model.process.parameter.type.input;

import com.ibm.spectrumcomputing.cwl.model.process.parameter.ParameterType;
import com.ibm.spectrumcomputing.cwl.model.process.parameter.binding.CommandLineBinding;

/**
 * Represents an input record field
 */
public class InputRecordField {

    private String name;
    private ParameterType recordType;
    private String doc;
    private CommandLineBinding inputBinding;
    private String label;
    private Object value;

    /**
     * Returns the name of this field
     * 
     * @return The name of this field
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of this field
     * 
     * @param name
     *            The name of this field
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the field type
     * 
     * @return The field type
     */
    public ParameterType getRecordType() {
        return recordType;
    }

    /**
     * Sets the field type
     * 
     * @param recordType
     *            The field type
     */
    public void setRecordType(ParameterType recordType) {
        this.recordType = recordType;
    }

    /**
     * Returns the document of this field
     * 
     * @return The document of this field
     */
    public String getDoc() {
        return doc;
    }

    /**
     * Sets the document of this field
     * 
     * @param doc
     *            The document of this field
     */
    public void setDoc(String doc) {
        this.doc = doc;
    }

    /**
     * Returns the input binding object
     * 
     * @return A CommandLineBinding object
     */
    public CommandLineBinding getInputBinding() {
        return inputBinding;
    }

    /**
     * Sets the input binding object
     * 
     * @param inputBinding
     *            A CommandLineBinding object
     */
    public void setInputBinding(CommandLineBinding inputBinding) {
        this.inputBinding = inputBinding;
    }

    /**
     * Returns the label of this field
     * 
     * @return The label of this field
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the label of this field
     * 
     * @param label
     *            The label of this field
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Returns the value of this field
     * 
     * @return The value of this field
     */
    public Object getValue() {
        return value;
    }

    /**
     * Sets the value of this field
     * 
     * @param value
     *            The value of this field
     */
    public void setValue(Object value) {
        this.value = value;
    }
}