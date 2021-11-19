package com.rakesh.observers;

import com.rakesh.Subject;

public interface Observer {
    void update(Subject subject, Object arg);
}
