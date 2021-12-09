package com.info.plugin;

import com.janetfilter.core.Environment;
import com.janetfilter.core.models.FilterRule;
import com.janetfilter.core.plugin.MyTransformer;
import com.janetfilter.core.plugin.PluginEntry;

import java.util.ArrayList;
import java.util.List;

public class MyPluginEntry implements PluginEntry {
    private final List<MyTransformer> transformers = new ArrayList<>();

    @Override public void init(Environment environment, List<FilterRule> filterRules) {
        this.transformers.add(new InfoTransformer(filterRules));
    }

    @Override public String getName() {
        return "INFO";
    }

    @Override public String getAuthor() {
        return "com.info";
    }

    @Override public String getVersion() {
        return "v1.0.1";
    }

    @Override public String getDescription() {
        return "info plugin for ja-netfilter";
    }

    @Override public List<MyTransformer> getTransformers() {
        return this.transformers;
    }
}
