﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Sirius.Win32.Lib.Controls.Interfaces;
using Sirius.Win32.Lib.Controls;
using Sirius.Win32.Svc.Controls;
using System.ServiceModel;

namespace Sirius.Win32.SvcImpl.Controls
{
    [ServiceBehavior(Namespace = "http://progressbar.controls.win32lib.server.sirius.org/")]
    public class ProgressBarSvc : IProgressBarContract
    {
        private ProgressBar bar;

        public ProgressBarSvc() 
        {
            bar = new ProgressBar();
        }

        public double GetLowerBound(int hwnd)
        {
            return bar.GetLowerBound(hwnd);
        }

        public double GetUpperBound(int hwnd)
        {
            return bar.GetUpperBound(hwnd);
        }

        public double GetPosition(int hwnd)
        {
            return bar.GetPosition(hwnd);
        }
    }
}
