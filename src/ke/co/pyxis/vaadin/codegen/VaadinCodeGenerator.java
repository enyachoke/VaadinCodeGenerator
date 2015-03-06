package ke.co.pyxis.vaadin.codegen;

import com.intellij.psi.PsiClass;
import ke.co.pyxis.vaadin.velocity.VelocityCall;
import ke.co.pyxis.vaadin.velocity.VelocityTemplater;

public class VaadinCodeGenerator
{
	private final VelocityTemplater templater;


	public VaadinCodeGenerator()
	{
		// Set up a Velocity instance that loads from this .jar
		this.templater = new VelocityTemplater();
	}


	public String generateView(PsiClass entity,String packageName)
	{
		VelocityCall call = templater.template("/ke/co/pyxis/vaadin/codegen/templates/views.vm");
        PersistentMember persistentMember=new PersistentMember(entity);
        call.set("entity",persistentMember );

        call.set("package", packageName);
		return call.process();
	}
    public String generateForm(PsiClass entity,String packageName)
    {
        VelocityCall call = templater.template("/ke/co/pyxis/vaadin/codegen/templates/forms.vm");
        PersistentMember persistentMember=new PersistentMember(entity);
        call.set("entity",persistentMember );

        call.set("package", packageName);
        return call.process();
    }
    public String generateRepo(PsiClass entity,String packageName)
    {
        VelocityCall call = templater.template("/ke/co/pyxis/vaadin/codegen/templates/repos.vm");
        PersistentMember persistentMember=new PersistentMember(entity);
        call.set("entity",persistentMember );

        call.set("package", packageName);
        return call.process();
    }
    public String generateService(PsiClass entity,String packageName)
    {
        VelocityCall call = templater.template("/ke/co/pyxis/vaadin/codegen/templates/services.vm");

        PersistentMember persistentMember=new PersistentMember(entity);
        call.set("entity",persistentMember );

        call.set("package", packageName);

        return call.process();
    }
    public String generateServiceImpl(PsiClass entity,String packageName)
    {
        VelocityCall call = templater.template("/ke/co/pyxis/vaadin/codegen/templates/servicesImpl.vm");
        PersistentMember persistentMember=new PersistentMember(entity);
        call.set("entity",persistentMember );

        call.set("package", packageName);

        return call.process();
    }
}
