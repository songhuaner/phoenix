package com.ludius;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;


/**
 * Goal which touches a timestamp file.
 *
 * @goal touch
 * 
 * @phase process-sources
 */
@Mojo(name="hello",defaultPhase = LifecyclePhase.CLEAN)
public class MyMojo extends AbstractMojo
{
    @Parameter
    private String test;

    public void execute() throws MojoExecutionException
    {
        System.out.println("MyMojo::execute::TEST::"+test);
    }



}
