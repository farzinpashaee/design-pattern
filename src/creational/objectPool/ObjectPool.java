package creational.objectPool;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public abstract class ObjectPool<T> {

    private long timeout = 30000;
    HashMap<T,Long> inuse, pending;

    public ObjectPool(){
        inuse = new HashMap<>();
        pending = new HashMap<>();
    }

    public abstract T create();
    public abstract void expire(T o);

    public synchronized T get() {
        long now = System.currentTimeMillis();
        T t;
        if ( pending.size() > 0 ) {

            for (Map.Entry item : pending.entrySet()) {
                t = (T) item.getKey();
                if ((now - pending.get(t)) > timeout) {
                    pending.remove(t);
                    expire(t);
                    t = null;
                } else {
                    pending.remove(t);
                    inuse.put(t, now);
                    return t;
                }
            }
        }
        // pool is empty
        t = create();
        inuse.put(t,now);
        return t;
    }

    public synchronized void returnObject(T t) {
        inuse.remove(t);
        pending.put(t, System.currentTimeMillis());
    }


}
