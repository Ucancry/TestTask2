class andersenMinsk implements Project {
    @Override
    public WebProject createWebProject() {
        return new AndersenMinskWebProject();
    }
    @Override
    public MobileProject createMobileProject() {
        return new AndersenMinskMobileProject();
    }
}
class andersenKiev implements Project{
    @Override
    public WebProject createWebProject() {
        return new AndersenKievWebProject();
    }

    @Override
    public MobileProject createMobileProject() {
        return new AndersenKievMobileProject();
    }
}
interface Project {
    WebProject createWebProject();
    MobileProject createMobileProject();
}
interface WebProject {}
interface MobileProject {}

class AndersenMinskWebProject implements WebProject {
    AndersenMinskWebProject() { }
}
class AndersenMinskMobileProject implements MobileProject {
    AndersenMinskMobileProject() { }
}
class AndersenKievWebProject implements  WebProject {
    AndersenKievWebProject() {}
}
class AndersenKievMobileProject implements MobileProject{
    AndersenKievMobileProject(){ }
}
