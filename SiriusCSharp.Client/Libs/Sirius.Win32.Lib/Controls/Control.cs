﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows.Automation;
using log4net;

namespace Sirius.Win32.Lib.Controls
{
    public class Control : Window
    {
        private static readonly ILog logger = LogManager.GetLogger(typeof(Control));

        protected ControlType controlType = null;

        public AutomationElement GetElement(int hwnd)
        {
            AutomationElement element = Find(hwnd);
            return element;
        }

        public int Find(int parent, int index)
        {
            AutomationElement baseElement = base.Find(parent);
            Condition locator = new PropertyCondition(AutomationElement.ControlTypeProperty, controlType);
            AutomationElementCollection elements = baseElement.FindAll(TreeScope.Subtree, locator);
            if (elements.Count <= index)
            {
                return 0;
            }
            logger.Debug(String.Format("Found hwnd: {0}",elements[index].Current.NativeWindowHandle));
            return elements[index].Current.NativeWindowHandle;
        }

        public int Find(int parent, int id, int index)
        {
            AutomationElement baseElement = base.Find(parent);
            Condition[] conditions = 
            {
                new PropertyCondition(AutomationElement.ControlTypeProperty, controlType),
                new PropertyCondition(AutomationElement.RuntimeIdProperty,id)
            };

            Condition locator = new AndCondition(conditions);

            AutomationElementCollection elements = baseElement.FindAll(TreeScope.Subtree, locator);
            if (elements.Count <= index)
            {
                return 0;
            }
            logger.Debug(String.Format("Found hwnd: {0}", elements[index].Current.NativeWindowHandle));
            return elements[index].Current.NativeWindowHandle;
        }
    }
}
