//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.github.kr328.clash.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IMultiProcessPreferenceChangeListener extends IInterface {
    void onPreferenceChanged(String var1) throws RemoteException;

    public abstract static class Stub extends Binder implements IMultiProcessPreferenceChangeListener {
        private static final String DESCRIPTOR = "rikka.preference.IMultiProcessPreferenceChangeListener";
        static final int TRANSACTION_onPreferenceChanged = 1;

        public Stub() {
            this.attachInterface(this, "rikka.preference.IMultiProcessPreferenceChangeListener");
        }

        public static IMultiProcessPreferenceChangeListener asInterface(IBinder obj) {
            if (obj == null) {
                return null;
            } else {
                IInterface iin = obj.queryLocalInterface("rikka.preference.IMultiProcessPreferenceChangeListener");
                return (IMultiProcessPreferenceChangeListener)(iin != null && iin instanceof IMultiProcessPreferenceChangeListener ? (IMultiProcessPreferenceChangeListener)iin : new IMultiProcessPreferenceChangeListener.Stub.Proxy(obj));
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            String descriptor = "rikka.preference.IMultiProcessPreferenceChangeListener";
            switch(code) {
            case 1:
                data.enforceInterface(descriptor);
                String _arg0 = data.readString();
                this.onPreferenceChanged(_arg0);
                reply.writeNoException();
                return true;
            case 1598968902:
                reply.writeString(descriptor);
                return true;
            default:
                return super.onTransact(code, data, reply, flags);
            }
        }

        public static boolean setDefaultImpl(IMultiProcessPreferenceChangeListener impl) {
            if (IMultiProcessPreferenceChangeListener.Stub.Proxy.sDefaultImpl == null && impl != null) {
                IMultiProcessPreferenceChangeListener.Stub.Proxy.sDefaultImpl = impl;
                return true;
            } else {
                return false;
            }
        }

        public static IMultiProcessPreferenceChangeListener getDefaultImpl() {
            return IMultiProcessPreferenceChangeListener.Stub.Proxy.sDefaultImpl;
        }

        private static class Proxy implements IMultiProcessPreferenceChangeListener {
            private IBinder mRemote;
            public static IMultiProcessPreferenceChangeListener sDefaultImpl;

            Proxy(IBinder remote) {
                this.mRemote = remote;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return "rikka.preference.IMultiProcessPreferenceChangeListener";
            }

            public void onPreferenceChanged(String key) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();

                try {
                    _data.writeInterfaceToken("rikka.preference.IMultiProcessPreferenceChangeListener");
                    _data.writeString(key);
                    boolean _status = this.mRemote.transact(1, _data, _reply, 0);
                    if (!_status && IMultiProcessPreferenceChangeListener.Stub.getDefaultImpl() != null) {
                        IMultiProcessPreferenceChangeListener.Stub.getDefaultImpl().onPreferenceChanged(key);
                        return;
                    }

                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }

            }
        }
    }

    public static class Default implements IMultiProcessPreferenceChangeListener {
        public Default() {
        }

        public void onPreferenceChanged(String key) throws RemoteException {
        }

        public IBinder asBinder() {
            return null;
        }
    }
}
