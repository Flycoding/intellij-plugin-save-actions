package com.dubreuia.core.java;

import java.util.List;

import com.dubreuia.processors.Processor;
import com.dubreuia.processors.java.ProcessorFactory;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFile;

class SaveActionManager extends com.dubreuia.core.SaveActionManager {

    @Override
    protected List<Processor> getSaveActionsProcessors(Project project, PsiFile psiFile) {
        List<Processor> processors = super.getSaveActionsProcessors(project, psiFile);
        List<Processor> javaProcessors = ProcessorFactory.INSTANCE.getSaveActionsProcessors(project, psiFile, storage);
        processors.addAll(javaProcessors);
        return processors;
    }

}